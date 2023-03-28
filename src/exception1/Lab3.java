/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author Student
 */
public class Lab3 {

    public static void main(String[] args) {
        int[] list = new int[10];

        try {
            System.out.println("statement 1");
            System.out.println(list[10]);
            System.out.println("statement 3");
        } catch (Exception ex) {

        } finally {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
    }
}
