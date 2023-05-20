/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyroomapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Navdeep singh
 */
public class Instructor {

    public int courseId;

    public static void seeBookingLogs(String courseId22) {

        ArrayList<String> tempArray = new ArrayList<>();
        boolean newFlag = false;

        String filepath = courseId22 + "StudyRoom.txt";
        try {

            String filePath = courseId22 + "StudyRoom.txt";
//              System.out.println(filePath);
            File insert = new File(filePath);
            BufferedReader availableOwnerCinemaseats = new BufferedReader(new FileReader(insert));

            String strLine;
            String id, courseId1, book, start, end, sid;
            String prevName = "jjljbhvjbjvhnjvhgbhbvgfhbvhghnvhgfhg";
            Boolean hasLine = false;
            String startCheck = "vvgwwdgs";
            String endCheck = "nscndkv";

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
                    if (Integer.parseInt(id) % 10 != 0) {
                        if (!(start.equals("NA"))) {
                            System.out.println("Room Id=" + ((Integer.parseInt(id) / 10) + 1) + " Seat Id=" + Integer.parseInt(id) % 10 +
                                    " Student Id=" + sid + " Start Time=" + start + " End Time=" + end);
                        }
                    } else {
                        if (!(start.equals("NA"))) {
                            System.out.println("Room Id=" + ((Integer.parseInt(id) / 10)) + " Seat Id=10 Student Id=" + sid + " Start Time=" + start + " End Time=" + end);
                        }
                    }

                }
                //////
            }

            availableOwnerCinemaseats.close();

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
