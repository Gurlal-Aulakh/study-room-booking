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
 
public class BookRoom {
    static public int roomId;
    public static void checkStudyRoom(String courseId,String startTimeHourcheck,String startTimeMinutecheck, String endTimeHourcheck, String endTimeMinutecheck){
    String setId;
          try {
              String filePath=courseId+"StudyRoom.txt";
//              System.out.println(filePath);
                File insert = new File(filePath);
                BufferedReader availableOwnerCinemaseats = new BufferedReader(new FileReader(insert));

                String strLine;
                String id, courseId1, book, start, end,sid;
                String prevName = "jjljbhvjbjvhnjvhgbhbvgfhbvhghnvhgfhg";
                Boolean hasLine = false;
                Boolean writeFlag=false;

                while ((strLine = availableOwnerCinemaseats.readLine()) != null) {
                    StringTokenizer st1 = new StringTokenizer(strLine, ",");
                    while (st1.hasMoreTokens()) {
                        id = st1.nextToken();
                        courseId1 = st1.nextToken();
                        book = st1.nextToken();
                        start = st1.nextToken();
                        end = st1.nextToken();
                        sid = st1.nextToken();

//                        System.out.println(id+courseId+book+start+end);
//                        System.out.println("start"+start);
if(studentId.equals(sid)){
    System.out.println("You cannot book more than 1 seats with 1 student id.");
    System.out.println("press 1 if you want to change student Id");
    System.out.println("press 2 to logout");
     Scanner scan45=new Scanner(System.in);
                        String y=scan45.nextLine();
                        if(y.equals("1")){
                            Login.getLoginInfo();
                        }
                        else{
                          System.exit(0);  
                        }
}
else{
    
if(start.equals("NA")) {
    setId=id;
//    System.out.println("setid:"+setId);
    bookEmptyStudyRoom(setId, courseId,startTimeHourcheck,startTimeMinutecheck,endTimeHourcheck,endTimeMinutecheck);
    writeFlag=true;
    break;
}
else{
    continue;
    
//    String tempStartHour="",tempStartMin="",tempEndHour="",tempEndMin="";
//    int inttempStartHour,inttempStartMin,inttempEndHour,inttempEndMin;
//    int intStartHour,intStartMin,intEndHour,intEndMin;
//    StringTokenizer st2 = new StringTokenizer(start, ":");
//           while (st2.hasMoreTokens()) {
//                          tempStartHour= st2.nextToken();
//                      tempStartMin = st2.nextToken();
//           }
//           StringTokenizer st3 = new StringTokenizer(end, ":");
//            while (st3.hasMoreTokens()) {
//                          tempEndHour= st3.nextToken();
//                      tempEndMin = st3.nextToken();
//           }
//            
//            inttempStartHour=Integer.parseInt(tempStartHour);
//            inttempStartMin=Integer.parseInt(tempStartMin);
//            inttempEndHour=Integer.parseInt(tempEndHour);
//            inttempEndMin=Integer.parseInt(tempEndMin);
//
//            intStartHour=Integer.parseInt(startTimeHourcheck);
//            intStartMin=Integer.parseInt(startTimeMinutecheck);
//            intEndHour=Integer.parseInt(endTimeHourcheck);
//            intEndMin=Integer.parseInt(endTimeMinutecheck);
//            
////            System.out.println(inttempEndHour+",,"+inttempEndMin);
//if(intStartHour-inttempEndHour>0){
//    setId=id;
//    System.out.println("setid:"+setId);
//    bookEmptyStudyRoom(setId, courseId,tempStartHour,tempStartMin,endTimeHourcheck,endTimeMinutecheck);
//    writeFlag=true;
//    break;
//}
//else if(intStartHour-inttempEndHour==0){
//    if(intStartMin-inttempEndMin>0){
//        setId=id;
//    System.out.println("setid:"+setId);
//    bookEmptyStudyRoom(setId, courseId,tempStartHour,tempStartMin,endTimeHourcheck,endTimeMinutecheck);
//    writeFlag=true;
//    break;
//    }
//}
//
////******************
//
//else if(inttempStartHour-intEndHour>0){
//    setId=id;
//    System.out.println("setid:"+setId);
//    bookEmptyStudyRoom(setId, courseId,startTimeHourcheck,startTimeMinutecheck,tempEndHour,tempEndMin);
//    writeFlag=true;
//    break;
//}
//else if(inttempStartHour-intEndHour==0){
//    if(inttempStartMin-intEndMin>0){
//        setId=id;
//    System.out.println("setid:"+setId);
//    bookEmptyStudyRoom(setId, courseId,startTimeHourcheck,startTimeMinutecheck,tempEndHour,tempEndMin);
//    writeFlag=true;
//    break;
//    }
//}

}
                    }
          }
                    if(writeFlag==true){
                        break;
                    }
                }

                availableOwnerCinemaseats.close();
            } catch (Exception e) {
                e.printStackTrace();

            }

}
         public static void bookEmptyStudyRoom(String setId, String courseId2,String startTimeHourEmpty,String startTimeMinuteEmpty, String endTimeHourEmpty, String endTimeMinuteEmpty){
            //System.out.println(startTimeHourEmpty+","+startTimeMinuteEmpty+","+endTimeHourEmpty+","+endTimeMinuteEmpty);
             ArrayList<String> tempArray = new ArrayList<>();
             boolean newFlag=false;
             String filepath=courseId2+"StudyRoom.txt";
             try {
                  
              String filePath=courseId2+"StudyRoom.txt";
//              System.out.println(filePath);
                File insert = new File(filePath);
                BufferedReader availableOwnerCinemaseats = new BufferedReader(new FileReader(insert));

                String strLine;
                String id, courseId1, book, start, end,sid;
                String prevName = "jjljbhvjbjvhnjvhgbhbvgfhbvhghnvhgfhg";
                Boolean hasLine = false;
                String startCheck="vvgwwdgs";
                String endCheck="nscndkv";

                while ((strLine = availableOwnerCinemaseats.readLine()) != null) {
                    StringTokenizer st1 = new StringTokenizer(strLine, ",");
                    while (st1.hasMoreTokens()) {
                        id = st1.nextToken();
                        courseId1 = st1.nextToken();
                        book = st1.nextToken();
                        start = st1.nextToken();
                        end = st1.nextToken();
                        sid = st1.nextToken();
//                       
//                        System.out.println("inside empty while loop");
                        if (id.equals(setId)) {
                        hasLine = true;
                        startCheck=start;
                        endCheck=end;
                        
                        

                        // ***** System.out.println(seatSelected);
                        tempArray.add(id + "," + courseId1 + "," + book + "," +startTimeHourEmpty+":"+startTimeMinuteEmpty+","+endTimeHourEmpty+":"+endTimeMinuteEmpty+","+studentId);
                        // writing a different file
//                            System.out.println("temparray:"+tempArray);
                        }

                     else {

                        tempArray.add(strLine);
                    }// TODO code application logic here
    
    
//                        System.out.println(id+courseId+book+start+end);


          }
                    //////
                }
                

                availableOwnerCinemaseats.close();
                
                if(startCheck.equals("NA") && endCheck.equals("NA") && (Integer.parseInt(setId)%10)==1 )
                        {
//                            (Integer.parseInt(setId)%10)==1
                            newFlag=true;
//                            System.out.println("new flag activated");
                        }
            } catch (Exception e) {
                e.printStackTrace();

            }
                     try {
            PrintWriter pr1 = new PrintWriter(filepath);
            for (String str : tempArray) {
//                System.out.println("str:"+str);
                pr1.println(str);
            }

            pr1.flush();
            pr1.close();
            if(newFlag==true){
                System.out.println("A new room is booked for You. Your assigned Room number is "+(Integer.parseInt(setId)/10+1)+" and Seat Id is "+(10-((Integer.parseInt(setId)/10+1)*10-Integer.parseInt(setId))));
                System.out.println("A new book is Ordered for this Room and will be Placed in the Room.");
            }
            else{
                if(Integer.parseInt(setId)%10!=0){
             System.out.println("Your assigned Room number is "+(Integer.parseInt(setId)/10+1)+" and Seat Id is "+(10-((Integer.parseInt(setId)/10+1)*10-Integer.parseInt(setId))));
                }
                else{
              System.out.println("Your assigned Room number is "+(Integer.parseInt(setId)/10)+" and Seat Id is 10");
  
                }
                
            }
                         System.out.println("press 1 if you want to book more slots");
                         System.out.println("press 2 to Logout");
                         Scanner scan44=new Scanner(System.in);
                        String x=scan44.nextLine();
                        if(x.equals("1")){
                            Login.getLoginInfo();
                        }
                        else{
                          System.exit(0);  
                        }
            
           
        } catch (Exception e) {
            e.printStackTrace();
        }
             
         } 
    
}
