package ex04_Operators;

public class Nested_TernaryOperators {
    public static void main(String[] args) {
//
        int marks=90;
        String grade=(marks>=90) ? "A+" : (marks >= 75) ? "A": (marks >=60) ? "B":(marks == 40) ? "C":"Fail";
        System.out.println(grade);

    }
}
