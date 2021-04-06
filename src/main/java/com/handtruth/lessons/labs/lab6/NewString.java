package com.handtruth.lessons.labs.lab6;

public class NewString implements CharSequence {

    String s;

    NewString(String s) {
        this.s = s;
    }

    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int index) {
        return s.charAt(index);
    }

    public int indexOf(char ch) {
        return s.indexOf(ch);
    }

    public boolean SequenceContains(CharSequence string) {
        return s.contains(string);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return s.substring(start, end);
    }
}
