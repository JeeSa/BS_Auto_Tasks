package ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	      int NoOfCases = Integer.parseInt(input.nextLine());
	      
	      List<Student_details> ListOfstudent = new ArrayList<Student_details>();
	      while(NoOfCases>0){
	         int id = input.nextInt();
	         String fname = input.next();
	         double cgpa = input.nextDouble();
	         
	         Student_details students = new Student_details(id, fname, cgpa);
	         ListOfstudent.add(students);
	         
	         NoOfCases--;
		
		
	}
	      Collections.sort(ListOfstudent, new Comparator<Student_details>() {
              @Override
               public int compare(Student_details candidate1, Student_details candidate2) {
                    if(candidate2.GetStudentCgpa()>candidate1.GetStudentCgpa()){
                        return 1;
                    }else if(candidate2.GetStudentCgpa()<candidate1.GetStudentCgpa()){
                        return -1;
                    }
                    return candidate1.GetStudentFirstName().compareTo(candidate2.GetStudentFirstName());
                }
        });
      
         for(Student_details st: ListOfstudent){
         System.out.println(st.GetStudentFirstName());
      }
   }
}

class Student_details{
	   private int Student_id;
	   private String first_name;
	   private double Student_cgpa;
	   public Student_details(int s_id, String f_name, double s_cgpa) {
	      super();
	      this.Student_id = s_id;
	      this.first_name = f_name;
	      this.Student_cgpa = s_cgpa;
	   }
	   public int GetStudentId() {
	      return Student_id;
	   }
	   public String GetStudentFirstName() {
	      return first_name;
	   }
	   public double GetStudentCgpa() {
	      return Student_cgpa;
	   }
	}


