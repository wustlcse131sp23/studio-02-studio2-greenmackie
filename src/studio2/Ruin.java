package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter starting amount of money: ");
		//int startAmount = in.nextInt();
		double winChance = 0.5; 
		double winLimit = 500;
		double startAmount = in.nextInt();
		double i = startAmount;
		
		
		int totalSimulations = 0;
		int p = totalSimulations;
		
		for (int j = 1; j <= 7; j++)
		{
		double	startAmount2 = in.nextInt();
		
		while (i < winLimit && i > 0)
		{
			double chance = Math.random();
			if (chance > winChance)
			{
				i++;
			}
			else
			{
				i--;
			}
			//System.out.println("You have $" + i);
			p++;
		}
		System.out.println("Number of Plays that took place that day: " + p);
		if (i==winLimit)
		{
			System.out.println("Day " + j +": You won the day!");
		}
		else 
		{
			System.out.println("Day " + j + ": Dang, you're broke!");
		}
		
		
		
		double expectedRuin = 1 - ((startAmount)/(winLimit));
		System.out.print("Expected Rate Simulation: " + expectedRuin);
		
		
		
		
		
		
	}

	
}
}

