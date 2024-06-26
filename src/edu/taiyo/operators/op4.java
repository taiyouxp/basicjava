package edu.taiyo.operators;

public class op4 {
        public static void main(String[] args) {
        String nameOne = "kendrick";
        String nameTwo = new String("kendrick");

        System.out.println("its the same name?" + nameOne.equals(nameTwo));

        int num1 = 1;
        int num2 = 2;

        boolean yn = num1 == num2;
        System.out.println("num1 = num2?" + yn);
        yn = num1 != num2;
        System.out.println("num1 != num2?" + yn); 
        yn = num1 > num2;
        System.out.println("num1 > num2?" + yn); 
        }
}
