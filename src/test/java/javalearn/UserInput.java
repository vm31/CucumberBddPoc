package javalearn;

import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
        Scanner arch = new Scanner(System.in);
        // double is used fractions, double digits
        //this is simple calculation program
        Double fnum, snum, answer;//variables
        System.out.println("Enter first num: ");
        fnum = arch.nextDouble();
        System.out.println("Enter second num: ");
        snum= arch.nextDouble();
        answer = fnum + snum;
        System.out.println("sum =" + answer);


    }
}
