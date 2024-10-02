package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Soru3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 10; i++){
            int randomNum = (int)(Math.random() * 30);
            System.out.println(randomNum);
            sum+=randomNum;
        }
        System.out.println("sum = " + sum);
    }
}