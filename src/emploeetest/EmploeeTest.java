/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emploeetest;


//week2
//OLeksii Hordiienko

public class EmploeeTest {

    public static void main(String[] args) {
       int indexofMax1=0;
       int indexofMax2=0;
      int indexofMin1=0;
      int indexofMin2=0;
      char letterGrade = 0;
        int[][] grades = {{97, 87, 90},//i can also do the input from the keyboard 
        {45, 65, 76},
        {70, 80, 45},};    //Creating separeted arrays for grades only
 
       
        String[] names = {"Alex", "Vova", "Dima"};//input from keyboard for names(only 3 students)

        System.out.println("Student Grades");
        {
            for (int i = 0; i < 3; i++) {//only 3 students

                System.out.println(" Student " + (i + 1) + " : " + names[i]);
                System.out.println(" Midterm Grade 1: " + grades[i][0]);
                System.out.println(" Midterm Grade 2: " + grades[i][1]);
                System.out.println(" Final: " + grades[i][2]);//all outupts for students together for each row
               if (grades[i][2]>=90){
                   letterGrade='A';
               }
              else if (grades[i][2]>=70 && grades[i][2]<=90 ){
                   letterGrade='B';
               }
              else if (grades[i][2]>=50 && grades[i][2]<=70 )
               letterGrade='C';
             System.out.println(" Letter grade "+ letterGrade);
        }  
            
            
             System.out.println(" The Higest Grade is: " + getHigest(grades) + " ;");//get highest grade 
            System.out.println(" The Lowest Grade is: " + getLowest(grades) + " ;");//get lowest grade
            System.out.println(" The Average Grade in Class is: " + getAverage(grades) + " ;");//get avarage

        
    }
        for (int j = 0; j < grades.length; j++) {
            for (int i = 0; i < grades[j].length; i++) {
                if (grades[indexofMax1][indexofMax2] < grades[j][i]) {
                    indexofMax1 = j;
                    indexofMax2 = i;
                    
                }
                
            }
            
        }
        System.out.println(" The name of student who has the highest grade is "+ names[indexofMax1]);
    
     for (int j = 0; j < grades.length; j++) {
            for (int i = 0; i < grades[j].length; i++) {
                if (grades[indexofMin1][indexofMin2] > grades[j][i]) {
                    indexofMin1 = j;
                    indexofMin2 = i;
                    
                }
                
            }
            
        }
        System.out.println(" The name of student who has the lovest grade is "+ names[indexofMin1]);
    }
    
    
    public static int getHigest(int[][] grades) {//getting highest value, compering all of them and going throug all massive 
        int higest = grades[0][0];
        for (int j = 0; j < grades.length; j++) {

            for (int i = 0; i < grades[j].length; i++) {
                if (grades[j][i] > higest) {
                    higest = grades[j][i];

                }
            }
            

        }
        return higest;
    }

    public static int getLowest(int[][] grades) {//getting lowest value, compering all of them and going throug all massive
        int lowest = grades[0][0];
        for (int j = 0; j < grades.length; j++) {
            for (int i = 0; i < grades[j].length; i++) {
                if (grades[j][i] < lowest) {
                    lowest = grades[j][i];
                }
            }
        }
        return lowest;
    }

    public static int getAverage(int[][] grades) {//getting average value, summering all of them and going throug all massive and store it at sum var
        int sum = 0;
        int avg;
        for (int j = 0; j < grades[0].length; j++) {
            sum = 0;
            for (int i = 0; i < grades[j].length; i++) {
                sum += grades[i][0];
            }
        }
        avg = sum / (grades.length);
        return avg;

    }
    

}