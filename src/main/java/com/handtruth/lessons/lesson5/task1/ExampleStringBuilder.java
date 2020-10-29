package com.handtruth.lessons.lesson5.task1;

public class ExampleStringBuilder {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        String str = "Hello";
        StringBuilder builder = new StringBuilder(str);

        builder.append(" ").append("world");  // str = str + " " + "world";
        System.out.println(builder.toString());

        builder.insert(6, 'W');
        System.out.println(builder.toString());

        builder.deleteCharAt(7);
        System.out.println(builder.toString());

        builder.replace(1, 5, "_______");
        System.out.println(builder.toString());

        builder.reverse();
        System.out.println(builder.toString());

        StringBuilder b = new StringBuilder();
        b.append("Hello")
                .append(" ")
                .append("world")
                .deleteCharAt(6)
                .insert(6, 'W')
                .replace(0, 5, "ebal коня")
                .reverse();

        System.out.println(b.toString());

    }

}
