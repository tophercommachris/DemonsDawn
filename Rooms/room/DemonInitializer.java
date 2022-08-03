package room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import demonblueprint.BaseDemon;
import level1demons.*;
import level2demons.*;
import level3demons.*;
import level4demons.*;
import level5demons.*;
import gamesource.Loop;

@SuppressWarnings("unused")
public class DemonInitializer {
	
	//HashMap<String, BaseDemon> demons = new HashMap<>();
	Random rand = new Random();
	int i;
	
	
	//Uses a nested for loop to fill a room with demons.  The second for loop using variable j generates a number below or equal to the room weight
	public void fillRooms(ArrayList<BaseRoom> rooms) {
		
		for (i = 1; i <= rooms.size()-1; i++) {
			
			for (int j = 1; j <= rooms.get(i).getRoomWeight(); j++)
			rooms.get(i).addRoomDemon(grabDemon(rooms));
		}
		
		
	}
	
	//Uses the demon difficulty to determine what level demon to generate for the room.
	private BaseDemon grabDemon(ArrayList<BaseRoom> rooms) {
		int demonRange = determineRoomDifficulty(rooms);
		
		if (demonRange <= 3 && demonRange > 0) {
			
			return(generateLevelOneDemon());
		}
		
		else if (demonRange <= 6) {
			
		}
		
		else if (demonRange <= 9) {
			
		}
		
		else if (demonRange <= 12) {
			
		}
		
		else if (demonRange <= 15) {
			
		}
		
		return null;
			
	}
	
	
	private int determineRoomDifficulty(ArrayList<BaseRoom> rooms) {
		int num = -1;
		num =rooms.get(i).getRoomDifficulty();
		
		return num;
	}
	
	private BaseDemon generateLevelOneDemon() {
		
		if ((rand.nextInt(100)+1) <= 50)
			return (new Slaughterblug());
		
		else if ((rand.nextInt(100)+1) <= 100)
			return (new Yecheolus());
		
		return null;
	}
	
	
	
}
