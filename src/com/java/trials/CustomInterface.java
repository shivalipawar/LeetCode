package com.java.trials;

@FunctionalInterface
interface Modify {
    String modify(String input);
}

class MyModify implements Modify {

    @Override
    public String modify(String input) {
        return "Hello" + input;
    }
}

public class CustomInterface {
    public static void changeString(Modify modifier, String str) {
        System.out.println(modifier.modify(str));
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
    }
}

