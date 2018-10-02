package studentDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class studentDatabaseApp {

  public static void main(String[] args) {



    // Ask for the total number of users to add
    System.out.println("How many students do you want to enroll?");
    Scanner in = new Scanner(System.in);
    int totalStudents = in.nextInt();

    aStudent[] students = new aStudent[totalStudents];

    // Create n number of given students
    for (int i = 0; i<= totalStudents - 1; i++) {
      students[i] = new aStudent();
      students[i].enroll();
      students[i].viewAndPay();
      //System.out.println(students[i].printStatus());

    }
    for (int j = 0; j<= totalStudents -1; j++) {
      System.out.println(students[j].printStatus());
    }

  }
}
