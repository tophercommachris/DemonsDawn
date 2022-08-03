/* This is the master class of the entire game.  The game itself will run on this loop
 * and this class initializes both the logic and the Objects class that run every other
 * part of this game.
 */


package gamesource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Loop {
	static Objects objects;
	static int end = -1;
	static int choice = -1;
	
	Logic logic;
	Scanner sc = new Scanner(System.in);
	
	int roomIndex = 0;
	
	public Loop () throws IOException, InterruptedException {
		objects = new Objects();
		objects.initializeGame();
		logic = new Logic();
		gameLoop();
	}
	
	private void gameLoop() throws InterruptedException {
		
		while (end != 1) {
			System.out.println("\nWhat would you like to do? 1. Look Around 2. Check Stats 3. Look At Inventory 4. Attack Demons In The Room 5. Talk To The Shopkeep 6. Quit Game \n");
			choice = sc.nextInt();
			
			if (choice == 1) {
				logic.lookAround();
				logic.takeExit();
			}
			
			else if (choice == 2) {
				Loop.objects.player.displayStats();
			}
			
			else if (choice == 3) {
				
			}
			
			else if (choice == 4) {
				logic.startCombat(Loop.objects.player);
			}
			
			else if (choice == 5) {
				
			}
			
			else if (choice == 6) {
				end = 1;
				System.out.println("\n\nGame Over Man...");
			}
		} //End While Loop
		
	} //End Game Loop
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Loop loop = new Loop();
	}
	
}
