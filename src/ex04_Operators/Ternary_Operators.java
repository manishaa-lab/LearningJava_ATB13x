package ex04_Operators;

public class Ternary_Operators {
    public static void main(String[] args) {
        int a=40;
        int b=20;
        // Program 1: Find Max of Two Numbers using Ternary Operators.
        //Below statement says check whether a is greater than b or not if yes print a else b
        int max = (a>b) ? a :b;
        System.out.println(max);
    }
}
