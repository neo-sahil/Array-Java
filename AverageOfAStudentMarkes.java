package arraysInJava;

import java.util.Scanner;

public class AverageOfAStudentMarkes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		int n = sc.nextInt();
		
		int[] marks = new int[n];
		int sum=0;
		
		System.out.println("Enter the marks of each subject now:");
		
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
			sum += marks[i];
		}
		float average=(float)sum/n;
		
		System.out.println("The avegare marks of the student is "+average);
		

		
		
		

	}

}
