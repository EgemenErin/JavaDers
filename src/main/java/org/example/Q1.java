package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Q1 {
    public static void main(String[] args) {
        int aa=5;
        int bb=6;
        int cc=5;
        if ((aa == bb && aa != cc) || (aa == cc && aa != bb) || (bb == cc && bb != aa) || (aa == bb && aa == cc)) {
            System.out.println("Error");
        }
    }
}