/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studyroomapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Navdeep singh
 */
public class StudyRoomApp {
 static String studentId;
 int[] arr6311;
    /*
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       System.out.println("press 1 to login as an student");
       System.out.println("press 2 to Login as an Instructor");
           Scanner scanRole = new Scanner(System.in);
           
           String role = scanRole.nextLine();
           if(role.equals("1")){
               Login.getLoginInfo();
           }
           if(role.equals("2")){
               Login.getInstructorLogin();
           }
   
  
   } 
//   
//   public static void getInstructorLogin(){
//       Scanner scanLogin = new Scanner(System.in);
//           System.out.println("please enter Your ID");
//          String InstructorId = scanLogin.nextLine();
//            System.out.println("please enter Your Password");
//           String password = scanLogin.nextLine();
//           if(password.equals("123")){
//               System.out.println("Login Succesful");
//               System.out.println("Press any key to see Booking logs");
//                scanLogin.nextLine();
//                Scanner scan1 = new Scanner(System.in);
//           System.out.println("please select the course id :");
//                      System.out.println("press 1 for 6311");
//                                 System.out.println("press 2 for 6322");
//                                            System.out.println("press 3 for 6333");
//           int courseIdChoice = Integer.parseInt(scan1.nextLine());
//           String courseId1 = null;
//           if(courseIdChoice==1)
//           {
//              courseId1="6311"; 
//           }
//           else if(courseIdChoice==2){
//               courseId1="6322";
//           }
//           else if(courseIdChoice==3){
//               courseId1="6333";
//           }
//                seeBookingLogs(courseId1);
//                
//           }
//           else{
//               System.out.println("please Try again!!!");
//           }
//   }
//   
   
   
//   public static void seeBookingLogs(String courseId22){
//       
//           ArrayList<String> tempArray = new ArrayList<>();
//             boolean newFlag=false;
//             
//             String filepath=courseId22+"StudyRoom.txt";
//             try {
//                  
//              String filePath=courseId22+"StudyRoom.txt";
////              System.out.println(filePath);
//                File insert = new File(filePath);
//                BufferedReader availableOwnerCinemaseats = new BufferedReader(new FileReader(insert));
//
//                String strLine;
//                String id, courseId1, book, start, end,sid;
//                String prevName = "jjljbhvjbjvhnjvhgbhbvgfhbvhghnvhgfhg";
//                Boolean hasLine = false;
//                String startCheck="vvgwwdgs";
//                String endCheck="nscndkv";
//
//                while ((strLine = availableOwnerCinemaseats.readLine()) != null) {
//                    StringTokenizer st1 = new StringTokenizer(strLine, ",");
//                    while (st1.hasMoreTokens()) {
//                        id = st1.nextToken();
//                        courseId1 = st1.nextToken();
//                        book = st1.nextToken();
//                        start = st1.nextToken();
//                        end = st1.nextToken();
//                        sid = st1.nextToken();
////                       
////                        System.out.println("inside empty while loop");
//                     if(Integer.parseInt(id)%10!=0){
//                        System.out.println("Room Id="+((Integer.parseInt(id)/10)+1)+" Seat Id="+Integer.parseInt(id)%10+" Student Id="+sid+" Start Time="+start+" End Time="+end);
//                     }
//                     else{
//                     System.out.println("Room Id="+((Integer.parseInt(id)/10))+" Seat Id=10 Student Id="+sid+" Start Time="+start+" End Time="+end);
//
//                     }
//    
////                        System.out.println(id+courseId+book+start+end);
//
//
//          }
//                    //////
//                }
//                
//
//                availableOwnerCinemaseats.close();
//                
//             
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//                   
//
//   }
   
//    public static void getLoginInfo(){
//       Scanner scanLogin = new Scanner(System.in);
//           System.out.println("please enter Your ID");
//           studentId = scanLogin.nextLine();
//            System.out.println("please enter Your Password");
//           String password = scanLogin.nextLine();
//           if(password.equals("123")){
//               System.out.println("Login Succesful");
//               System.out.println("Press any key to Continue");
//                scanLogin.nextLine();
//                getChoice();
//           }
//           else{
//               System.out.println("please Try again!!!");
//           }
//   }
   
//   
//   
//   public static void getChoice(){
//       Scanner scan = new Scanner(System.in);
//       System.out.println("Press 1 to see study room by Course Id");
//       System.out.println("Press 2 to see study room by book");
//        int choice1 = scan.nextInt();
//        getInputs(choice1);
//   }
//    
//   public static void getInputs(int choice){
//       String startTimeHour="";
//        String startTimeMinute="";
//        String endTimeHour="";
//        String endTimeMinute="";
//       if(choice==2){
//           
//           double startTimecalc=1;
//           double endTimecalc=1;
//           String courseId="";
//            Scanner scan1 = new Scanner(System.in);
//           System.out.println("please select the Book Name");
//           System.out.println("press 1 for software engineering");
//                                 System.out.println("press 2 for Telecommunication Networks");
//                                            System.out.println("press 3 for Distributed Systems");
//           int bookNameChoice = Integer.parseInt(scan1.nextLine());
////           bookName=bookName.toLowerCase();
//           System.out.println("please enter the start time (hh:mm)");
//           String startTime=scan1.nextLine();
////            System.out.println("&*");
//           StringTokenizer st1 = new StringTokenizer(startTime, ":");
//           while (st1.hasMoreTokens()) {
//                         startTimeHour = st1.nextToken();
//                       startTimeMinute = st1.nextToken();
//                        startTimecalc=Double.parseDouble(startTimeHour)+(Double.parseDouble(startTimeMinute)/60);
////                      System.out.println("startTimecalc:"+startTimecalc);
//           }
//           System.out.println("please enter the end time (hh:mm)");
//           String endTime=scan1.nextLine();
////            System.out.println("&*");
//           StringTokenizer st2 = new StringTokenizer(endTime, ":");
//           while (st2.hasMoreTokens()) {
//                         endTimeHour = st2.nextToken();
//                       endTimeMinute = st2.nextToken();
//                       endTimecalc=Double.parseDouble(endTimeHour)+(Double.parseDouble(endTimeMinute)/60);
////                       System.out.println("endTimecalc:"+endTimecalc);
//           }
//           
////            System.out.println(endTimeHour+":"+endTimeMinute);
//            
//if(bookNameChoice==1)
//           {
//              courseId="6311"; 
//           }
//           else if(bookNameChoice==2){
//               courseId="6322";
//           }
//           else if(bookNameChoice==3){
//               courseId="6333";
//           }
//            if(endTimecalc-startTimecalc<1 || endTimecalc-startTimecalc>5){
//                System.out.println("Please check your Times. It should be Minimum 1 Hr and Maximum 5Hrs.");
//                System.out.println("press any key to continue...");
//                scan1.next();
//                getChoice();
//            }
//            else{
//         checkStudyRoom(courseId,startTimeHour,startTimeMinute,endTimeHour,endTimeMinute);
//
//            }
//            
//       }
//       if(choice==1){
//            Scanner scan1 = new Scanner(System.in);
//           System.out.println("please select the course id :");
//                      System.out.println("press 1 for 6311");
//                                 System.out.println("press 2 for 6322");
//                                            System.out.println("press 3 for 6333");
//           int courseIdChoice = Integer.parseInt(scan1.nextLine());
//           String courseId = null ;
//           if(courseIdChoice==1)
//           {
//              courseId="6311"; 
//           }
//           else if(courseIdChoice==2){
//               courseId="6322";
//           }
//           else if(courseIdChoice==3){
//               courseId="6333";
//           }
//          
//           System.out.println("please enter the start time (hh:mm)");
//           String startTime=scan1.nextLine();
//           double startTimecalc=1;
//           double endTimecalc=1;
////            System.out.println("&*");
//           StringTokenizer st1 = new StringTokenizer(startTime, ":");
//           while (st1.hasMoreTokens()) {
//                         startTimeHour = st1.nextToken();
//                       startTimeMinute = st1.nextToken();
//                       startTimecalc=Double.parseDouble(startTimeHour)+(Double.parseDouble(startTimeMinute)/60);
////                      System.out.println("startTimecalc:"+startTimecalc);
//           }
//           System.out.println("please enter the end time (hh:mm)");
//           String endTime=scan1.nextLine();
////            System.out.println("&*");
//           StringTokenizer st2 = new StringTokenizer(endTime, ":");
//           while (st2.hasMoreTokens()) {
//                         endTimeHour = st2.nextToken();
//                       endTimeMinute = st2.nextToken();
//                       endTimecalc=Double.parseDouble(endTimeHour)+(Double.parseDouble(endTimeMinute)/60);
////                       System.out.println("endTimecalc:"+endTimecalc);
//           }
//           
////            System.out.println(endTimeHour+":"+endTimeMinute);
//            if(endTimecalc-startTimecalc<1 || endTimecalc-startTimecalc>5){
//                System.out.println("Please check your Times. It should be Minimum 1 Hr and Maximum 5Hrs.");
//                System.out.println("press any key to continue...");
//                scan1.next();
//                getChoice();
//            }
//            else{
//         checkStudyRoom(courseId,startTimeHour,startTimeMinute,endTimeHour,endTimeMinute);
//
//            }
//       
//       }
//   }
//   
//   
//          public static void checkStudyRoom(String courseId,String startTimeHourcheck,String startTimeMinutecheck, String endTimeHourcheck, String endTimeMinutecheck){
//    String setId;
//          try {
//              String filePath=courseId+"StudyRoom.txt";
////              System.out.println(filePath);
//                File insert = new File(filePath);
//                BufferedReader availableOwnerCinemaseats = new BufferedReader(new FileReader(insert));
//
//                String strLine;
//                String id, courseId1, book, start, end,sid;
//                String prevName = "jjljbhvjbjvhnjvhgbhbvgfhbvhghnvhgfhg";
//                Boolean hasLine = false;
//                Boolean writeFlag=false;
//
//                while ((strLine = availableOwnerCinemaseats.readLine()) != null) {
//                    StringTokenizer st1 = new StringTokenizer(strLine, ",");
//                    while (st1.hasMoreTokens()) {
//                        id = st1.nextToken();
//                        courseId1 = st1.nextToken();
//                        book = st1.nextToken();
//                        start = st1.nextToken();
//                        end = st1.nextToken();
//                        sid = st1.nextToken();
//
////                        System.out.println(id+courseId+book+start+end);
////                        System.out.println("start"+start);
//if(studentId.equals(sid)){
//    System.out.println("You cannot book more than 1 seats with 1 student id.");
//    System.out.println("press 1 if you want to change student Id");
//    System.out.println("press 2 to logout");
//     Scanner scan45=new Scanner(System.in);
//                        String y=scan45.nextLine();
//                        if(y.equals("1")){
//                            Login.getLoginInfo();
//                        }
//                        else{
//                          System.exit(0);  
//                        }
//}
//else{
//    
//if(start.equals("NA")) {
//    setId=id;
////    System.out.println("setid:"+setId);
//    bookEmptyStudyRoom(setId, courseId,startTimeHourcheck,startTimeMinutecheck,endTimeHourcheck,endTimeMinutecheck);
//    writeFlag=true;
//    break;
//}
//else{
//    continue;
//    
////    String tempStartHour="",tempStartMin="",tempEndHour="",tempEndMin="";
////    int inttempStartHour,inttempStartMin,inttempEndHour,inttempEndMin;
////    int intStartHour,intStartMin,intEndHour,intEndMin;
////    StringTokenizer st2 = new StringTokenizer(start, ":");
////           while (st2.hasMoreTokens()) {
////                          tempStartHour= st2.nextToken();
////                      tempStartMin = st2.nextToken();
////           }
////           StringTokenizer st3 = new StringTokenizer(end, ":");
////            while (st3.hasMoreTokens()) {
////                          tempEndHour= st3.nextToken();
////                      tempEndMin = st3.nextToken();
////           }
////            
////            inttempStartHour=Integer.parseInt(tempStartHour);
////            inttempStartMin=Integer.parseInt(tempStartMin);
////            inttempEndHour=Integer.parseInt(tempEndHour);
////            inttempEndMin=Integer.parseInt(tempEndMin);
////
////            intStartHour=Integer.parseInt(startTimeHourcheck);
////            intStartMin=Integer.parseInt(startTimeMinutecheck);
////            intEndHour=Integer.parseInt(endTimeHourcheck);
////            intEndMin=Integer.parseInt(endTimeMinutecheck);
////            
//////            System.out.println(inttempEndHour+",,"+inttempEndMin);
////if(intStartHour-inttempEndHour>0){
////    setId=id;
////    System.out.println("setid:"+setId);
////    bookEmptyStudyRoom(setId, courseId,tempStartHour,tempStartMin,endTimeHourcheck,endTimeMinutecheck);
////    writeFlag=true;
////    break;
////}
////else if(intStartHour-inttempEndHour==0){
////    if(intStartMin-inttempEndMin>0){
////        setId=id;
////    System.out.println("setid:"+setId);
////    bookEmptyStudyRoom(setId, courseId,tempStartHour,tempStartMin,endTimeHourcheck,endTimeMinutecheck);
////    writeFlag=true;
////    break;
////    }
////}
////
//////******************
////
////else if(inttempStartHour-intEndHour>0){
////    setId=id;
////    System.out.println("setid:"+setId);
////    bookEmptyStudyRoom(setId, courseId,startTimeHourcheck,startTimeMinutecheck,tempEndHour,tempEndMin);
////    writeFlag=true;
////    break;
////}
////else if(inttempStartHour-intEndHour==0){
////    if(inttempStartMin-intEndMin>0){
////        setId=id;
////    System.out.println("setid:"+setId);
////    bookEmptyStudyRoom(setId, courseId,startTimeHourcheck,startTimeMinutecheck,tempEndHour,tempEndMin);
////    writeFlag=true;
////    break;
////    }
////}
//
//}
//                    }
//          }
//                    if(writeFlag==true){
//                        break;
//                    }
//                }
//
//                availableOwnerCinemaseats.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//
//}
//         public static void bookEmptyStudyRoom(String setId, String courseId2,String startTimeHourEmpty,String startTimeMinuteEmpty, String endTimeHourEmpty, String endTimeMinuteEmpty){
//            //System.out.println(startTimeHourEmpty+","+startTimeMinuteEmpty+","+endTimeHourEmpty+","+endTimeMinuteEmpty);
//             ArrayList<String> tempArray = new ArrayList<>();
//             boolean newFlag=false;
//             String filepath=courseId2+"StudyRoom.txt";
//             try {
//                  
//              String filePath=courseId2+"StudyRoom.txt";
////              System.out.println(filePath);
//                File insert = new File(filePath);
//                BufferedReader availableOwnerCinemaseats = new BufferedReader(new FileReader(insert));
//
//                String strLine;
//                String id, courseId1, book, start, end,sid;
//                String prevName = "jjljbhvjbjvhnjvhgbhbvgfhbvhghnvhgfhg";
//                Boolean hasLine = false;
//                String startCheck="vvgwwdgs";
//                String endCheck="nscndkv";
//
//                while ((strLine = availableOwnerCinemaseats.readLine()) != null) {
//                    StringTokenizer st1 = new StringTokenizer(strLine, ",");
//                    while (st1.hasMoreTokens()) {
//                        id = st1.nextToken();
//                        courseId1 = st1.nextToken();
//                        book = st1.nextToken();
//                        start = st1.nextToken();
//                        end = st1.nextToken();
//                        sid = st1.nextToken();
////                       
////                        System.out.println("inside empty while loop");
//                        if (id.equals(setId)) {
//                        hasLine = true;
//                        startCheck=start;
//                        endCheck=end;
//                        
//                        
//
//                        // ***** System.out.println(seatSelected);
//                        tempArray.add(id + "," + courseId1 + "," + book + "," +startTimeHourEmpty+":"+startTimeMinuteEmpty+","+endTimeHourEmpty+":"+endTimeMinuteEmpty+","+studentId);
//                        // writing a different file
////                            System.out.println("temparray:"+tempArray);
//                        }
//
//                     else {
//
//                        tempArray.add(strLine);
//                    }// TODO code application logic here
//    
//    
////                        System.out.println(id+courseId+book+start+end);
//
//
//          }
//                    //////
//                }
//                
//
//                availableOwnerCinemaseats.close();
//                
//                if(startCheck.equals("NA") && endCheck.equals("NA") && (Integer.parseInt(setId)%10)==1 )
//                        {
////                            (Integer.parseInt(setId)%10)==1
//                            newFlag=true;
////                            System.out.println("new flag activated");
//                        }
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//                     try {
//            PrintWriter pr1 = new PrintWriter(filepath);
//            for (String str : tempArray) {
//                System.out.println("str:"+str);
//                pr1.println(str);
//            }
//
//            pr1.flush();
//            pr1.close();
//            if(newFlag==true){
//                System.out.println("A new room is booked for You. Your assigned Room number is "+(Integer.parseInt(setId)/10+1)+" and Seat Id is "+(10-((Integer.parseInt(setId)/10+1)*10-Integer.parseInt(setId))));
//                System.out.println("A new book is Ordered for this Room and will be Placed in the Room.");
//            }
//            else{
//                if(Integer.parseInt(setId)%10!=0){
//             System.out.println("Your assigned Room number is "+(Integer.parseInt(setId)/10+1)+" and Seat Id is "+(10-((Integer.parseInt(setId)/10+1)*10-Integer.parseInt(setId))));
//                }
//                else{
//              System.out.println("Your assigned Room number is "+(Integer.parseInt(setId)/10)+" and Seat Id is 10");
//  
//                }
//                
//            }
//                         System.out.println("press 1 if you want to book more slots");
//                         System.out.println("press 2 to Logout");
//                         Scanner scan44=new Scanner(System.in);
//                        String x=scan44.nextLine();
//                        if(x.equals("1")){
//                            Login.getLoginInfo();
//                        }
//                        else{
//                          System.exit(0);  
//                        }
//            
//           
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//             
//         } 
}
        



