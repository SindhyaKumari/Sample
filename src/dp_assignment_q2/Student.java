/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_assignment_q2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sindhya */
public abstract class Student {
    private final String name;                  
    public ArrayList<Double> listAssigments = new ArrayList<>();
    public ArrayList<Double> listexams = new ArrayList<>();

    Student (String names){
    name=names;
    }
    
    public String getName(){
        return name;
    }
    
    public void addAssignmentScore (double as) { 
        listAssigments.add(as);
    }
    
    public void addExamScore (double es) {
	listexams.add(es);
    }
    
    public Iterator getAssignmentIterator() {
      return listAssigments.iterator();
    }
    public Iterator getExamIterator() {
	return listexams.iterator();
    }

    
    public final void getAverage(){
        sumExam();
        Average();
        sumAssignment();
    }

    public abstract void Average ();
    public abstract double sumExam();
    public abstract double sumAssignment();
}
