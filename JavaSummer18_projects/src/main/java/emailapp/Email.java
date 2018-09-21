package emailapp;

import java.util.Scanner;

public class Email {
  //Property variables
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String email;
  private String company = "ashtincreations";
  private int mailboxCapacity = 100;
  private String alternateEmail;


  // Constructor to receive the first and last name
  public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("Employee: " + this.firstName + " " + this.lastName + "\n");

    //call a method that asks for the department and return that department
    this.department = setDepartment();
//    System.out.println("Department: " + department);

    //Call a method that will return a random password for the email
    this.password = randomPass(6);
    System.out.println("Password: " + password);

    //We now have all the elements we need to create the appropriate email
    //combine the elements of this Email to create and email address
    email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company + ".com";

//    System.out.println("Address: " + email);

  }



  // Ask for the department
  private String setDepartment() {
    System.out.println("Departments\n1 for Sales\n2 for Accounting\n3 for None\n\nEnter the department code:");
    Scanner in = new Scanner(System.in);
    int departmentChoice = in.nextInt();

    //switch cases to determine the input from the user
    //the default return is an empty string ""
    switch (departmentChoice) {
      case 1: return "sales";
      case 2: return "acc";
      case 3: return "";
      default: return "";
    }

  }

  // Generate a random password
  private String randomPass(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    char[] password = new char[length];
    for (int i = 0; i<length; i++) {
      //Math.rand generates a random number between 0-1
      //we then multiply that by the length of our passwordSet options
      int rand = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
  }

  //SET METHODS

  // Set the mailbox cap
  public void setMailboxCapacity(int capacity) {
    this.mailboxCapacity = capacity;
  }


  // Set the alternate email address
  public void setAlternateEmail(String altEmail) {
    this.alternateEmail = altEmail;
  }

  // Changing the password
  public void setPassword(String newPass) {
    this.password = newPass;
  }




  //GET METHODS

  //get alternate email
  public String getAlternateEmail() {
    return this.alternateEmail;
  }

  //get mailbox capacity
  public int getMailboxCapacity() {
    return this.mailboxCapacity;
  }

  //get password
  public String getPassword() {
    return this.password;
  }

  //get emailAddress
  public String getEmail() {
    return this.email;
  }

  //get first name
  public String getFirstName() {
    return this.firstName;
  }

  //get last name
  public String getLastName() {
    return this.lastName;
  }

  //get whole name
  public String getWholeName() {
    return this.firstName + " " + this.lastName;
  }

  //display the full name, email address and mail capacity
  public void displayVitals() {
    System.out.println("\n" + getWholeName() + "\n" + getEmail() + "\n" + getMailboxCapacity());
  }

}
