import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {
	private String firstName, lastName, StudentID;
	private String courses = null;
	private int gradeYear;
	private int tuitionBalance = 0;
	private int costOfCourse = 600;
	private static int id = 1000;

	public void Student() {
		// the constructor

		Scanner in = new Scanner(System.in);
		System.out.println("What is your First name: ");
		this.firstName = in.nextLine();

		System.out.println("What is your Last name: ");
		this.lastName = in.nextLine();

		System.out.print("Select your class Level:\n 1- Freshman\n 2- for Sophmore \n 3- Junior \n 4- Sinor \n ");
		this.gradeYear = in.nextInt();
		generateID();
		System.out
				.println("Full Name: " + firstName + " " + lastName + " \nGrade Year: " + gradeYear + "\n" + StudentID);

	}

	/* Generate ID */
	private String generateID() {
		id++;
		StudentID = gradeYear + "" + id;
		// System.out.println(StudentID);
		return StudentID;
	}

	/* Enroll Method */
	public void enroll() {
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			
			if (!course.equals("Q")) {
				courses = courses + " \n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}else {
				break;
			}
			
		} while (1 != 0);
		System.out.println("Enrolled in: " + courses);
		System.out.println("Tuition Balance: " + tuitionBalance);
	}

	/* Account Balance */
	public void viewBalance() {
		System.out.println("The account balance is: $" + tuitionBalance);
	}
	/* Pay Tuition */
	public void payTuition(int payment) {
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of "+ payment);
		viewBalance();
	}
	
	/* show status of payment */

	public void statusPayment (boolean status) {
		
	}
}
