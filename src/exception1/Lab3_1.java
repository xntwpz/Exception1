/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author Student
 */
public class Lab3_1 {

    public static void main(String[] args) {
        try {
            System.out.println("statement1");
            System.out.println(1/0);
            System.out.println("statement3");
        } catch (ArithmeticException e) {
        }
        finally {
            System.out.println("statement4");
        }
        System.out.println("statement5");

    }

}
