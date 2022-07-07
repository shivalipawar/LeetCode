package com.java.trials;

@FunctionalInterface
interface Modify {
    String modify(String input);
}

@FunctionalInterface
interface Validation {
    boolean validate(int num);
}


class MyModify implements Modify {

    @Override
    public String modify(String input) {
        return "Hello" + input;
    }
}

class MyValidation implements Validation {

    @Override
    public boolean validate(int num) {
        return num > 10;
    }
}

public class CustomInterface {
    public static void changeString(Modify modifier, String str) {
        System.out.println(modifier.modify(str));
    }

    public static void checkIfNumberGreaterThanTen(Validation validation, int num) {
        System.out.println(validation.validate(num));
    }

    public static void main(String[] args) {

        changeString(new MyModify(), "SHivali");

        changeString(new Modify() {
            @Override
            public String modify(String input) {
                return "Hello" + input;
            }
        }, "SHivali");

        changeString((s) -> "Hello" + s, "SHivali");

        checkIfNumberGreaterThanTen(new MyValidation(), 11);

        checkIfNumberGreaterThanTen(new MyValidation() {
            @Override
            public boolean validate(int num) {
                return super.validate(num);
            }
        }, 12);

        checkIfNumberGreaterThanTen((n) -> n > 10, 10);
    }
}

