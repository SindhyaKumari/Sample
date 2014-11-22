/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_assignment_q2;

import java.util.Scanner;

/**
 *
 * @author Sindhya
 */
public class DP_Assignment_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opt;
        Scanner in = new Scanner(System.in);
        System.out.print("hi hello");
        System.out.print("Press 1 to run calculate average through Algorithm 1\nPress 2 to run calculate average through Algorithm 2\n");
        System.out.print("Enter Choice :  ");
        opt = in.nextInt();

        if (opt == 1)
        {
        input_method1();
        }
        
        else if (opt == 2)
        {
        input_method2();
        }        
    }
    
    static void input_method1(){
        
        Student houseType = new Method1("k112225");
        double AssignScore, ExamScore;
        int num, num1;
        
        
        System.out.print ("Student Name: " + houseType.getName());
        System.out.println();
        Scanner in = new Scanner(System.in);
        
        System.out.println("How much Assignment Marks you want to enter?");
        num = in.nextInt();
        System.out.println("How much Exam Marks you want to enter?");
        num1 = in.nextInt();
        for (int i = 1; i <= num; i++)
        {
            System.out.println("Enter The "+ i +" Assignment Score: ");
            AssignScore = in.nextDouble();
            houseType.addAssignmentScore(AssignScore);
        }
        for (int i = 1; i <= num1; i++)
        {
            System.out.println("Enter The "+ i +" Exam Score: ");
            ExamScore = in.nextDouble();
            houseType.addExamScore(ExamScore);
        }
        houseType.Average();
        System.out.println();    
    }

        static void input_method2(){
        
        Student houseType1 = new Method2("k112225");
        double AssignScore, ExamScore;
        int num, num1;
                
        System.out.print ("Student Name: " + houseType1.getName());
        System.out.println();

        Scanner in = new Scanner(System.in);

        System.out.println("How many Assignment Marks do you want to enter?");
        num = in.nextInt();
        System.out.println("How manys Exam Marks do you want to enter?");
        num1 = in.nextInt();
        for (int i = 1; i <= num; i++)
        {
            System.out.println("Enter The "+ i +" Assignment Score: ");
            AssignScore = in.nextDouble();
            houseType1.addAssignmentScore(AssignScore);
        }
        for (int i = 1; i <= num1; i++)
        {
            System.out.println("Enter The "+ i +" Exam Score: ");
            ExamScore = in.nextDouble();
            houseType1.addExamScore(ExamScore);
        }
        houseType1.Average();
        System.out.println();
    }
}
