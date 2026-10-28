package studentinformationdystem;
        
//***********************************************************
//* Author : Muhammad Arif Syafiq Bin Muhammad Khailmi      *
//* Matric  : S87668                                        *
//* Program Name : StudentInformationSystem                 *
//* Description : To test GitHub                            *
//* Date : 21 October 2026                                  *
//***********************************************************

// Standard public class
public class StudentInformationSystem {

  //Public main class
    public static void main(String[] args) {
         
        //Display message
        System.out.print("Name : Arif Syafiq\n");
        System.out.print("Student ID : S87668\n");
        
        //Store mark
        int mark1 = 50, mark2 = 30;
        
        //Calculate Total Mark
        int total = mark1 + mark2;
        
        // Display Total Mark
        System.out.print("Total mark :"+ total);
        
        //Check the Total Mark
        if (total >= 80){
            System.out.println("\nResult: Excellent");
        }else if (total >= 50){
            System.out.println("Result: Good");
        }else {
            System.out.println("Need More Improvement!");
        }
    }
    
}
