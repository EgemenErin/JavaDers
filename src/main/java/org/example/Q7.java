package org.example;

public class Q7 {

    public static void main(String[] args) {

        int[] nums = {8,5,2,9,3};

        int max = 0;

        for(int i : nums){

            if (i > max){

                max = i;

            }

        }

        System.out.println(max);

    }

}


