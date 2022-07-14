package com.java.trials.Stream;

import com.java.trials.Stream.enums.TaskType;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<Task> tasks = getTasks();

        //Find all reading task titles sorted by their title
//        getReadingTitleSortedByTitle(tasks);

        //Find all reading task titles sorted by their creation date
//        getReadingTitleSortedByCreationDate(tasks);

        //Find distinct task
//        findDistinctTask(tasks);

        //Find top 5 reading tasks sorted by creation date
//        top5ReadingTitleSortedByCreationDate(tasks);

        //Count all reading tasks
//        countReadingTasks(tasks);

        //Find all unique tags from all tasks - flatten tags as its set then make it into stream and then select distinct and collect in list
//        uniqueTags(tasks);

        //Check if all reading tags have books
//        checkIfAllReadingTitleHaveTaskAsBook(tasks);

        //Creating summary of titles - Return summary as one line so use reduce to do it.
//        summaryOfTasks(tasks);

        //Primitive stream which work on int, long
        //IntStream.range(0,10).forEach(System.out::println);

        //Collectors usage for groupingByTaskType
//        groupByTaskType(tasks);

        //Collectors to get longest title of task
//        getTaskWithTitleOfMaxLength(tasks);

        //Collectors to group by task type and created on
//        groupByTaskTypeAndCreateOn(tasks);

        //partition data with due date on task
//        createPartitionOfDataOnDate(tasks);

        //Generate statistics
        IntSummaryStatistics statistics = tasks.stream().map(Task::getTitle).collect(Collectors.summarizingInt(String::length));
//        System.out.println("Avg : "+statistics.getAverage());
//        System.out.println("Count : "+statistics.getCount());
//        System.out.println("Max : "+statistics.getMax());
//        System.out.println("Sum : "+statistics.getSum());

        //Combine all task titles
        String collect = tasks.stream().map(Task::getTitle).collect(Collectors.joining(", "));
        System.out.println("Titles combined is "+collect);



        //Count total number of tags
//        IntSummaryStatistics count = tasks.stream().collect(Collectors.summarizingInt(task -> task.getTags().size()));
//        System.out.println(count);
    }

    private static void createPartitionOfDataOnDate(List<Task> tasks) {
        Map<Boolean, List<Task>> listOfTaskAndCreationDate = tasks.stream().collect(Collectors.partitioningBy(task -> task.getCreatedOn().isAfter(LocalDate.now())));
        for (Map.Entry<Boolean, List<Task>> entry:listOfTaskAndCreationDate.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    private static void groupByTaskTypeAndCreateOn(List<Task> tasks) {
        Map<TaskType, Map<LocalDate, List<Task>>> collect = tasks.stream().collect(Collectors.groupingBy(Task::getTaskType, Collectors.groupingBy(Task::getCreatedOn)));
        for (Map.Entry<TaskType, Map<LocalDate,List<Task>>> entry:collect.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    private static void getTaskWithTitleOfMaxLength(List<Task> tasks) {
        Task taskWithTitleOfMaxLength = tasks.stream().collect(Collectors.collectingAndThen(Collectors.maxBy((t1, t2) -> t1.getTitle().length() - t2.getTitle().length()), Optional::get));
        System.out.println("Task with title of max length - "+taskWithTitleOfMaxLength.getTitle());
    }

    private static void groupByTaskType(List<Task> tasks) {
        Map<TaskType, List<Task>> taskGroupedByType = tasks.stream().collect(Collectors.groupingBy(Task::getTaskType));
        for (Map.Entry<TaskType, List<Task>> task: taskGroupedByType.entrySet()) {
            System.out.println("Key : "+task.getKey());
            for (int i = 0; i < task.getValue().size(); i++) {
                System.out.println("Value : "+ task.getValue().get(i).getTitle());
            }
        }
    }

    private static void summaryOfTasks(List<Task> tasks) {
        String s = tasks.stream().map(Task::getTitle).reduce((first, second) -> first + " *** " + second).get();
        System.out.println("Summary of titles is : "+s);
    }

    private static void checkIfAllReadingTitleHaveTaskAsBook(List<Task> tasks) {
        //anyMatch if any readingTitle has book as tag
        //allMatch all readingTitle to have book as tag
        boolean taskWithTagBooks = tasks.stream().filter(task -> task.getTaskType().equals(TaskType.READING)).allMatch(task -> task.getTags().contains("books"));
        System.out.println("Do all reading task have tag as books : "+taskWithTagBooks);
    }

    private static void uniqueTags(List<Task> tasks) {
        List<String> uniqueTags = tasks.stream().flatMap(task -> task.getTags().stream()).distinct().collect(Collectors.toList());
        uniqueTags.forEach(System.out::println);
    }

    private static void countReadingTasks(List<Task> tasks) {
        long readingTitlesSize = tasks.stream().filter(task -> task.getTaskType().equals(TaskType.READING))
                .count();

        System.out.println("Number of reading titles: "+readingTitlesSize);
    }


    private static void top5ReadingTitleSortedByCreationDate(List<Task> tasks) {
        List<String> readingTitles = tasks.stream().filter(task -> task.getTaskType().equals(TaskType.READING))
                .sorted(Comparator.comparing(Task::getCreatedOn))
                .map(Task::getTitle)
                .limit(5)
                .collect(Collectors.toList());

        readingTitles.forEach(System.out::println);
    }


    private static void findDistinctTask(List<Task> tasks) {
        List<String> distinctTask = tasks.stream().distinct().map(Task::getTitle).collect(Collectors.toList());
        distinctTask.forEach(System.out::println);
    }

    private static void getReadingTitleSortedByCreationDate(List<Task> tasks) {
        List<String> readingTitles = tasks.stream().filter(task -> task.getTaskType().equals(TaskType.READING))
                .sorted(Comparator.comparing(Task::getCreatedOn))
                .map(Task::getTitle)
                .collect(Collectors.toList());

        readingTitles.forEach(System.out::println);
    }

    private static void getReadingTitleSortedByTitle(List<Task> tasks) {
        List<String> readingTask = tasks.stream().filter(task -> task.getTaskType().equals(TaskType.READING))
                .sorted(Comparator.comparingInt(t -> t.getTitle().length()))
                .map(Task::getTitle)
                .collect(Collectors.toList());

        readingTask.forEach(System.out::println);
    }

    private static List<Task> getTasks() {
        Task task1 = new Task("1","Read Version Control with Git book", TaskType.READING, LocalDate.of(2015, Month.JULY, 1));
        task1.addTag("git");
        task1.addTag("reading");
        task1.addTag("books");

        Task task2 = new Task("2","Read Java 8 Lambdas book", TaskType.READING, LocalDate.of(2015, Month.JULY, 2));
        task2.addTag("java8");
        task2.addTag("reading");
        task2.addTag("books");

        Task task3 = new Task("3","Write a mobile application to store my tasks", TaskType.CODING, LocalDate.of(2015, Month.JULY, 3));
        task3.addTag("coding");
        task3.addTag("mobile");

        Task task4 = new Task("4","Write a blog on Java 8 Streams", TaskType.WRITING, LocalDate.of(2015, Month.JULY, 4));
        task4.addTag("blogging");
        task4.addTag("writing");
        task4.addTag("streams");

        Task task5 = new Task("5","Read Domain Driven Design book", TaskType.READING, LocalDate.of(2015, Month.JULY, 5));
        task5.addTag("ddd");
        task5.addTag("books");
        task5.addTag("reading");

        return Arrays.asList(task1, task2, task3, task4, task5);
    }
}
