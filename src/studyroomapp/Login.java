/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyroomapp;

import java.util.Scanner;


import static studyroomapp.StudyRoomApp.studentId;

/**
 *
 * @author Navdeep singh
 */
public class Login {
   static public int studentid;
   static public int instructorId;
   static public int studentPassword;
   static public int instructorPassword;
    
   public static void getInstructorLogin(){
       Scanner scanLogin = new Scanner(System.in);
           System.out.println("please enter Your ID");
          String InstructorId = scanLogin.nextLine();
            System.out.println("please enter Your Password(password-123)");
           String password = scanLogin.nextLine();
           if(password.equals("123")){
               System.out.println("Login Succesful");
               System.out.println("Press any key to see Booking logs");
                scanLogin.nextLine();
                Scanner scan1 = new Scanner(System.in);
           System.out.println("please select the course id :");
                      System.out.println("press 1 for 6311");
                                 System.out.println("press 2 for 6322");
                                            System.out.println("press 3 for 6333");
           int courseIdChoice = Integer.parseInt(scan1.nextLine());
           String courseId1 = null;
           if(courseIdChoice==1)
           {
              courseId1="6311"; 
           }
           else if(courseIdChoice==2){
               courseId1="6322";
           }
           else if(courseIdChoice==3){
               courseId1="6333";
           }
                Instructor.seeBookingLogs(courseId1);
                
           }
           else{
               System.out.println("please Try again!!!");
           }
   }
   
    public static void getLoginInfo(){
       Scanner scanLogin = new Scanner(System.in);
           System.out.println("please enter Your ID");
           studentId = scanLogin.nextLine();
            System.out.println("please enter Your Password(Password-123)");
           String password = scanLogin.nextLine();
           if(password.equals("123")){
               System.out.println("Login Succesful");
               System.out.println("Press any key to Continue");
                scanLogin.nextLine();
                Student.getChoice();
           }
           else{
               System.out.println("please Try again!!!");
           }
   }
   
    
}
