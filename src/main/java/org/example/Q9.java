package org.example;

public class Q9 {

    public static boolean CheckIfLegal(int a, int b){
        if(a >= 18 && b >= 18){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(CheckIfLegal(15, 4));
    }
}


