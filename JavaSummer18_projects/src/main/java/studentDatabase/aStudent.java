package studentDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class aStudent {
  private String firstName;
  private String lastName;
  private int year;
  private String studentId;
  private Integer tuition = 0;
  private ArrayList<String> classes;

  private static int coursePrice = 600;


  //Using a static id so that the whole class can use it as a sort of counter for whenever a new
  //  student is created
  private static int id = 1000;


  //Constructor will prompt the user for the name and year of the student
  public aStudent() {
    //prompt the first name
    Scanner in = new Scanner(System.in);
    System.out.println("Enter first name: ");
    this.firstName = in.nextLine();

    //prompt the last name
    System.out.println("Enter last name: ");
    this.lastName = in.nextLine();

    System.out.println("Freshman--1\nSophmore--2\nJunior--3\nSenior--4");
    this.year = in.nextInt();

    this.classes = new ArrayList<String>();

    setId();


    System.out.println("\nName: " + this.firstName + " " + this.lastName);

    System.out.println("Year: " + this.year);
    System.out.println("Student ID: " + this.studentId);
    System.out.println("Base Tuition: " + this.tuition + "\n");


  }

  //Set method for the students name
  private String setName() {
    System.out.println("Enter the first name: ");
    Scanner in = new Scanner(System.in);
    String first = in.toString();
    return first;
  }


  //Generate id for the student
  private void setId() {
    id++;
    studentId = this.year + "" + this.id;
  }
  //Enroll student in courses
  public void enroll() {
    Scanner in = new Scanner(System.in);
    String answer = "";

    while (!answer.equals("q")) {
      System.out.println("Enter the course you want to enroll in?");
      System.out.println("Physics---1\nAstronomy---2\nLiterature---3");
      answer = in.nextLine();
      if (!answer.equals("q")) {
        if (answer.equals("1")) {
          this.classes.add("Physics");
        }
        else if (answer.equals("2")) {
          this.classes.add("Astronomy");
        }
        else this.classes.add("Literature");
        this.tuition = this.tuition + this.coursePrice;
      }

    }
//    System.out.println("Total Tuition: $" + this.tuition + "\n");
  }

  //View Balance
  public String viewTuition() {
    return "Current Tuition Balance: $" + this.tuition;
  }
  //View balance and pay tuition
  public void viewAndPay() {
    System.out.println("\n" + viewTuition());
    System.out.println("\nHow much would you like to pay? ");
    Scanner in = new Scanner(System.in);
    Integer payment = in.nextInt();

    this.tuition = this.tuition - payment;
    System.out.println("Thank you for your payment!\nUpdated Balance: $" + this.tuition);
  }


  //Print student status
  public String printStatus() {
    return "\nName: " + this.firstName + " " + this.lastName +
        "\nYear: " + year +
        "\nStudent id: " + id +
        "\nCourses Enrolled: " + this.classes +
        "\n" + viewTuition();
  }

  //get student first name
  private String getFirstName() {
    return this.firstName;
  }

  private String getLastName() {
    return this.lastName;
  }


}
