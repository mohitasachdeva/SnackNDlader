package com.snackladder;

public class SnackNLadder1 {
    public static void main(String[] args) {


        System.out.println("Welcome to Snake and Ladder Game !");
        int Position = 0;
        int no = (int) (Math.random() * 10) % 6 + 1;
        System.out.println(no);
    }
}