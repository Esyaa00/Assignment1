import java.util.*;
public class AboutMe {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);	
	
	printName();
	printAge();
	printGender();
	printMarital();
        printCitizenship();
	printAddress();
	printHP();
	printCgpa();
	printGrade();
	printGpa();
	printWork1();
	printWork2();
	printLanguage1();
        printLanguage2();
        printSkills1();
        printSkills2();
        printSkills3();
        printAwards1();
	printAwards2();
	printAwards3();
	
	input.close();
	
	}
	
	public static void printName() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Your Name:");
		String name =input.next();
		System.out.println("Name " + name ); }

	public static void printAge() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Your Age:");
	    int age =input.nextInt();
	    System.out.println("Age " + age ); }
	 
	public static void printGender() {
		Scanner input = new Scanner (System.in);
			
		System.out.print("Enter Your Gender:");
		String gender = input.next();
		System.out.println("Gender " + gender ); }
	
	public static void printMarital() {
		Scanner input = new Scanner (System.in);
			
		System.out.print("Enter Your Marital:");
		String marital = input.next();
		System.out.println("Marital " + marital ); }

	public static void printCitizenship() {
		Scanner input = new Scanner (System.in);
			
		System.out.print("Enter Your Citizenship:");
		String citizenship = input.next();
		System.out.println("Citizenship " + citizenship ); }
		
	public static void printAddress() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Home Address:");
		String home = input.next();
		System.out.println("Enter Your Home Address " + home ); }
	
	public static void printHP() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Phone:");
		String HP = input.next();
		System.out.println("Enter Your Phone " + HP ); }
	
	public static void printCgpa() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Cgpa:");
		double cgpa = input.nextDouble();
		System.out.println("Cgpa " + cgpa ); }
	
	public static void printGrade() {
    	Scanner input = new Scanner (System.in);
    	
    	System.out.print("Enter Grade STIA113:");
        String str = input.next();
        char grade = str.charAt(0);
        System.out.println("Grade " + grade); }
	
	public static void printGpa() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter GPA Semester 1:");
	    double num1 = input.nextDouble();
	    System.out.println("Enter GPA Semester 2:");
	    double num2 = input.nextDouble();
	    
	    double sum = num1+num2;
	    double totalgpa = sum/2;
	    System.out.println("CGPA for current semester is " + totalgpa); }
	
	public static void printWork1() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Work1:");
		String work = input.next();
		System.out.println("Enter Your Work1 " + work ); }
	
	public static void printWork2() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Work2:");
		String work = input.next();
		System.out.println("Enter Your Work2 " + work ); }
	
	public static void printLanguage1() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Language1:");
		String language = input.next();
		System.out.println("Enter Your Language1 " + language ); }
	
	public static void printLanguage2() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Language 2:");
		String language = input.next();
		System.out.println("Enter Your Language 2 " + language ); }
	
	public static void printSkills1() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Skills 1:");
		String skills = input.next();
		System.out.println("Enter Your Skills 1 " + skills ); }

	public static void printSkills2() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Skills 2:");
		String skills = input.next();
		System.out.println("Enter Your Skills 2 " + skills ); }
	
	public static void printSkills3() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Skills 3:");
		String skills = input.next();
		System.out.println("Enter Your Skills 3 " + skills ); }
	
	public static void printAwards1() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Awards1:");
		String awards = input.next();
		System.out.println("Enter Your Awards1 " + awards ); }
	
	public static void printAwards2() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Awards2:");
		String awards = input.next();
		System.out.println("Enter Your Awards2 " + awards ); }
	
	public static void printAwards3() {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter Your Awards3:");
		String awards = input.next();
		System.out.println("Enter Your Awards3 " + awards ); 
	
	input.close();
	
	
	}

}
