package com.example.javatest;

import java.util.Scanner;

/**
 * 设计自己的异常类表示对负数求平方根的错误；在类 Test 的主方法中，从键盘输入一
 * 数，若输入的数不小于 0，则输出它的平方根；若小于 0，则抛出自定义异常；在程序中处
 * 理异常并输出提示信息“输入错误，不能对负数求平方根”
 */
public class Test {

    public static void main(String[] args) {

        try {
            double result = sqrt();
            System.out.println(result);
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    private static double sqrt() throws MyException {
        double result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int number = input.nextInt();
        if (number < 0) {
            throw new MyException("输入错误，不能对负数求平方根");
        } else {
            result = Math.sqrt(number);
        }
        return result;
    }
}

class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}














