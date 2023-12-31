package Printstatement;

import java.util.Scanner;

public class Arraysexercise {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=5;
		int[] nums = new int[5];
				System.out.println("Enter 5 number of element in array :");
				
		for(int i=0;i<n;i++)
		{
			nums[i] =scanner.nextInt();
						
		}
		for(int j=0;j<n;j++)
		{
			System.out.print(nums[j]);
			
		}
		
	}

}
