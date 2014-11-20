/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_assignment_q2;

import java.util.Collections;
import java.util.Iterator;

/**
 *
  * @author Sindhya
 */
public class Method2 extends Student {

    Method2(String name){
    super(name);
    }
    @Override
    public double sumExam() {
        double i = 0;
        double Temp = 0.0;
        double SumAllExam = 0.0;
        double SixtyPercExam = 0.0;
        Iterator itr = getExamIterator();
        while(itr.hasNext()) {
        Object element = itr.next();
        Temp = (double) element;
        SumAllExam = SumAllExam + Temp; 
        i++;
        }
        SumAllExam = SumAllExam/i;
        SixtyPercExam = (SumAllExam * 60)/100;
        return SixtyPercExam;
    }
    
     public void Average(){
        double SA = sumAssignment();
        double SE = sumExam();
        double SUM = SA + SE;
        System.out.print("Average of Method 2: " + SUM);
    }
     
    @Override
    public double sumAssignment() {
        double SumAllAssign = 0.0;
        double min = 0.0;
        double Temp = 0.0;
        double i = 0;
        boolean found = false;
        double FortyPerceAssign = 0.0;
        Object obj = Collections.min(listAssigments);
        min = (double) obj;
        Iterator itr = getAssignmentIterator();
        while(itr.hasNext()) {
        Object element = itr.next();
        Temp = (double) element;
        if (Temp == min && found == false)
        {
            found = true;
        }
        else
        {
            SumAllAssign = SumAllAssign + Temp ;
        }
        i++;
        }
        i = i-1;
        SumAllAssign = SumAllAssign/i;
        FortyPerceAssign = (SumAllAssign * 40)/100;
        return FortyPerceAssign;
    }
 
}