import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of subjects:");
    int numsubjects = sc.nextInt();
    
    int[] marks = new int[numsubjects];
    int totalMarks=0;
    
    for(int i=0;i<numsubjects;i++) {
    	System.out.println("Enter marks for subject "+(i+1)+"(1-100)");
    	int mark = sc.nextInt();
    	
    	while(mark<0||mark>100) {
    		System.out.println("Invalid mark.Please enter a value from(0-100");
    		mark=sc.nextInt();
    	}
    	marks[i]=mark;
    	totalMarks += mark;
    }
    
    double averagePercentage = (double) totalMarks/numsubjects;
    
    String grade;
    if(averagePercentage >= 90) {
    	grade="S";
    }else if(averagePercentage >= 80 && averagePercentage <90) {
    	grade="A";
    }else if(averagePercentage >= 70 && averagePercentage <80) {
    	grade="B";
    }else if(averagePercentage >= 60 && averagePercentage <70) {
    	grade="C";
    }else if(averagePercentage >= 50 && averagePercentage <60) {
    	grade="D";
    }else if(averagePercentage >= 40 && averagePercentage <50) {
    	grade="E";
    }else {
    	grade="F";
    }
    
    System.out.println("\n-----Result-----");
    System.out.println("TotalMarks:"+totalMarks);
    System.out.println("AveragePercentage:"+averagePercentage+"%");
    System.out.println("Grade:"+grade);
    sc.close();
	}

}
