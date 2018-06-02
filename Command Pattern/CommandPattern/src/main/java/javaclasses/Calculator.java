/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

public class Calculator {
    private int current = 0;

    public void operation(char operator, int operand) {
        switch (operator) {
            case '+':
                current += operand;
                break;
            case '-':
                current -= operand;
                break;
            case '*':
                current *= operand;
                break;
            case '/':
                current /= operand;
                break;
        }
        System.out.println("Current value = " 
               + current + " after " + operator + " " + operand);
    }
}