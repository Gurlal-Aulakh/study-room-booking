/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyroomapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import static studyroomapp.StudyRoomApp.studentId;

/**
 *
 * @author Navdeep singh
 */
public class Student {
    
     
   static String studentId;
   static String courseId;
   static String bookName;
   public static void getChoice(){
       Scanner scan = new Scanner(System.in);
       System.out.println("Press 1 to see study room by Course Id");
       System.out.println("Press 2 to see study room by book");
        int choice1 = scan.nextInt();
        getInputs(choice1);
   }
    
   public static void getInputs(int choice){
       String startTimeHour="";
        String startTimeMinute="";
        String endTimeHour="";
        String endTimeMinute="";
       if(choice==2){
           
           double startTimecalc=1;
           double endTimecalc=1;
           String courseId="";
            Scanner scan1 = new Scanner(System.in);
           System.out.println("please select the Book Name");
           System.out.println("press 1 for software engineering");
                                 System.out.println("press 2 for Telecommunication Networks");
                                            System.out.println("press 3 for Distributed Systems");
           int bookNameChoice = Integer.parseInt(scan1.nextLine());
//           bookName=bookName.toLowerCase();
           System.out.println("please enter the start time (hh:mm)");
           String startTime=scan1.nextLine();
//            System.out.println("&*");
           StringTokenizer st1 = new StringTokenizer(startTime, ":");
           while (st1.hasMoreTokens()) {
                         startTimeHour = st1.nextToken();
                       startTimeMinute = st1.nextToken();
                        startTimecalc=Double.parseDouble(startTimeHour)+(Double.parseDouble(startTimeMinute)/60);
//                      System.out.println("startTimecalc:"+startTimecalc);
           }
           System.out.println("please enter the end time (hh:mm)");
           String endTime=scan1.nextLine();
//            System.out.println("&*");
           StringTokenizer st2 = new StringTokenizer(endTime, ":");
           while (st2.hasMoreTokens()) {
                         endTimeHour = st2.nextToken();
                       endTimeMinute = st2.nextToken();
                       endTimecalc=Double.parseDouble(endTimeHour)+(Double.parseDouble(endTimeMinute)/60);
//                       System.out.println("endTimecalc:"+endTimecalc);
           }
           
//            System.out.println(endTimeHour+":"+endTimeMinute);
            
if(bookNameChoice==1)
           {
              courseId="6311"; 
           }
           else if(bookNameChoice==2){
               courseId="6322";
           }
           else if(bookNameChoice==3){
               courseId="6333";
           }
            if(endTimecalc-startTimecalc<1 || endTimecalc-startTimecalc>5){
                System.out.println("Please check your Times. It should be Minimum 1 Hr and Maximum 5Hrs.");
                System.out.println("press any key to continue...");
                scan1.next();
                getChoice();
            }
            else{
         BookRoom.checkStudyRoom(courseId,startTimeHour,startTimeMinute,endTimeHour,endTimeMinute);

            }
            
       }
       if(choice==1){
            Scanner scan1 = new Scanner(System.in);
           System.out.println("please select the course id :");
                      System.out.println("press 1 for 6311");
                                 System.out.println("press 2 for 6322");
                                            System.out.println("press 3 for 6333");
           int courseIdChoice = Integer.parseInt(scan1.nextLine());
           String courseId = null ;
           if(courseIdChoice==1)
           {
              courseId="6311"; 
           }
           else if(courseIdChoice==2){
               courseId="6322";
           }
           else if(courseIdChoice==3){
               courseId="6333";
           }
          
           System.out.println("please enter the start time (hh:mm)");
           String startTime=scan1.nextLine();
           double startTimecalc=1;
           double endTimecalc=1;
//            System.out.println("&*");
           StringTokenizer st1 = new StringTokenizer(startTime, ":");
           while (st1.hasMoreTokens()) {
                         startTimeHour = st1.nextToken();
                       startTimeMinute = st1.nextToken();
                       startTimecalc=Double.parseDouble(startTimeHour)+(Double.parseDouble(startTimeMinute)/60);
//                      System.out.println("startTimecalc:"+startTimecalc);
           }
           System.out.println("please enter the end time (hh:mm)");
           String endTime=scan1.nextLine();
//            System.out.println("&*");
           StringTokenizer st2 = new StringTokenizer(endTime, ":");
           while (st2.hasMoreTokens()) {
                         endTimeHour = st2.nextToken();
                       endTimeMinute = st2.nextToken();
                       endTimecalc=Double.parseDouble(endTimeHour)+(Double.parseDouble(endTimeMinute)/60);
//                       System.out.println("endTimecalc:"+endTimecalc);
           }
           
//            System.out.println(endTimeHour+":"+endTimeMinute);
            if(endTimecalc-startTimecalc<1 || endTimecalc-startTimecalc>5){
                System.out.println("Please check your Times. It should be Minimum 1 Hr and Maximum 5Hrs.");
                System.out.println("press any key to continue...");
                scan1.next();
                getChoice();
            }
            else{
         BookRoom.checkStudyRoom(courseId,startTimeHour,startTimeMinute,endTimeHour,endTimeMinute);

            }
       
       }
   }
   
   
}
