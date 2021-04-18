package com.handtruth.lessons.lesson16;

public class EnumExample {
    public static void main(String[] args) {
        Color whiteColor = Color.WHITE;
        System.out.println(whiteColor.getRGB());

        Color redColor = Color.valueOf("RED");
        System.out.println(redColor.getRGB());
    }

    enum Color {
        WHITE(0, 0, 0),
        BLACK(255, 255, 255),
        RED(255, 0, 0),
        BLUE(0, 0, 255),
        GREEN(0, 255,  0);

        private int red;
        private int green;
        private int blue;

        Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public String getRGB() {
            return "rgv(" + red + "," + green + "," + blue + ") --> " + this.name();
        }
    }
}
