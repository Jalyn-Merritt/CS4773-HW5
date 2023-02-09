package main;

import elevatorFunctions.Elevator;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Elevator elevator = new Elevator();
		
		try {
			Scanner scanner = new Scanner(new FileInputStream(args[0]));
			while (scanner.hasNextLine()) {
				String[] tokenizedButtonInput = scanner.nextLine().split(" ");
				
				for(int i = 0; i < tokenizedButtonInput.length; i++)
					elevator.pushFloorButtons(tokenizedButtonInput[i]);
			}
			scanner.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
}