package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Q2 {
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            int randomNum = (int)(Math.random() * 100);
            System.out.println(randomNum);
            if (randomNum < 5){
                break;
            }
        }
    }
}