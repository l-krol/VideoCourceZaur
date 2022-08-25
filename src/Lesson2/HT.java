package Lesson2;

public class HT {
    public static void main(String [] args){

        byte b1 = 0B1100;
        byte b2 = 014;
        byte b3 = 12;
        byte b4 = 0XC;

        short s1 = 0B0101_0001_0100;
        short s2 = 02_424;
        short s3 = 1_300;
        short s4 = 0X514;

        int i1 = 0B0;
        int i2 = 00;
        int i3 = 0;
        int i4 = 0X0;

        System.out.println("First task:");
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);
        System.out.println();

        float f1 = 12.45F;
        float f2 = 4252222222464665.51561645616514f;

        double d1 = 9999.9995D;
        double d2 = 44169.9455d;

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("Second task:");
        System.out.println(f1 + " " + f2);
        System.out.println(d1 + " " + d2);
        System.out.println(bool1 + " " + bool2);
        System.out.println();

        char c1 = ' ';
        char c2 = 'a';
        char c3 = 'A';
        char c4 = 385;
        char c5 = '\u2849';
        char c6 = '5';

        System.out.println("Third task:");
        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5 + " " + c6);
        System.out.println();

    }
}
