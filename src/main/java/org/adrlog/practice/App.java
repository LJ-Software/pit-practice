package org.adrlog.practice;

public class App {

    public static void main(String[] args) {

        int a = 0;
        long b = 2147483649L;
        double c = 0.0;
        float d = 0.1f;

        a = a + 1;
        a = a * 1;
        a = a - 1;
        a = a / 1;
        a = a % 1;

        b = b + 1;
        b = b * 1;
        b = b - 1;
        b = b / 1;
        b = b % 1;

        c = c + 1;
        c = c * 1;
        c = c - 1;
        c = c / 1;
        c = c % 1;

        d = d + 1;
        d = d * 1;
        d = d - 1;
        d = d / 1;
        d = d % 1;
        if (a == 1) {
            a++;
        }
        if (a != 1) {
            a++;
        }
        if (a > 1) {
            a++;
        }
        if (a < 1) {
            a++;
        }
        if (a >= 1) {
            a++;
        }
        if (a <= 1) {
            a++;
        }

        if (a == 0) {
            a++;
        }
        if (a != 0) {
            a++;
        }
        if (a > 0) {
            a++;
        }
        if (a < 0) {
            a++;
        }
        if (a >= 0) {
            a++;
        }
        if (a <= 0) {
            a++;
        }

        System.out.println("Hello, World");
    }

    public void runThings() {

        returnByte();
        returnChar();
        returnDouble();
        returnFloat();
        returnInt();
        returnLong();
        returnShort();
        returnObject();
        returnString();
        returnVoid();
    }

    public void returnVoid() {
        System.out.println("returnVoid() called");
    }

    public short returnShort() {
        short s = 0;
        return s;
    }

    public long returnLong() {
        long l = 0L;
        return l;
    }

    public int returnInt() {
        int i = 0;
        return i;
    }

    public String returnString() {
        String s = "aa";
        return s;
    }

    public double returnDouble() {
        double d = 0.0d;
        return d;
    }

    public char returnChar() {
        char a = 'a';
        return a;
    }

    public Object returnObject() {
        Object obj = new Object();
        return obj;
    }

    public float returnFloat() {
        float f = 0f;
        return f;
    }

    public byte returnByte() {
        byte b = 68;
        return b;
    }
}