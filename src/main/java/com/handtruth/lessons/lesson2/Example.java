package com.handtruth.lessons.lesson2;

public class Example {

    public static String login(String login, String password) {
        String rightLogin = "2";
        String rightPassword = "12345";

        boolean is_login_valid = login.equals(rightLogin);
        boolean is_password_valid = password.equals(rightPassword);

        if (is_login_valid && is_password_valid) {
            return "Successful";
        } else if (!is_login_valid && !is_password_valid) {
            return "Login and password incorrect";
        } else {
            if (is_login_valid) {
                return "Password incorrect";
            } else {
                return "Login incorrect";
            }
        }
    }

    public static void main(String[] args) {
        String loginIn = "1";
        String passwordIn = "12345";
        String result = login(loginIn, passwordIn);
        System.out.println(result);
    }

}
