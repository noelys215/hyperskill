// Don't delete scanner import

import java.util.Scanner;

class Name {

    public static void method(int i, float f) {
        System.out.println("int float method");
    }

    public static void method(float f, int i) {
        System.out.println("float int method");
    }

    public static void method(int i1, int i2) {
        System.out.println("int int method");
    }

    public static void method(double d1, double d2) {
        System.out.println("double double method");
    }

    public static void main(String[] args) {
        method(1f, 1f);
    }

}