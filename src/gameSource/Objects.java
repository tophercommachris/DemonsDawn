package gameSource;
import java.io.BufferedReader;
import demons.*;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import rooms.Room;
import items.Item;
public class Objects {
	
	
	//These arraylists hold the information regarding the items and maps for the game
	static ArrayList<Room> rooms = new ArrayList<Room>();
	static ArrayList<Item> items = new ArrayList<Item>();
	static HashMap<String,Demon> demonMap = new HashMap<>();
	
	
	//This method initializes a list of demons using the DemonInitializer class
	static public void createDemons() {
		DemonInitializier demons = new DemonInitializier();
		demonMap = demons.fillDemonMap();
		
	}
	//This method reads the roomList.txt file and fills in each room in the rooms ArrayList with a room number, room ID, descriptions of the room, and each exit and exitID of the room
	static public void createRooms() throws IOException, FileNotFoundException {
		String line;
		int counter = 1;
		File roomFile = new File("roomList.txt");
		BufferedReader roomReader = new BufferedReader(new FileReader(roomFile));
		rooms.add(new Room());
		
		while ((line = roomReader.readLine()) != null) {
			
			
			if (line.contains("Number:")) {
				rooms.add(new Room());
				rooms.get(counter).setRoomNumber(counter);
				
			}
			
			else if (line.contains("ID:")) {
				line = line.replaceAll("ID:", "");
				rooms.get(counter).setRoomID(line);
			}
			
			else if(line.contains("Name:")) {
				line = line.replaceAll("Name:", "");
				rooms.get(counter).setRoomName(line);
			}
			
			else if (line.contains("Desc")) {
				line = line.replaceAll("Desc:", "");
				rooms.get(counter).setRoomDesc(line);
				
			}
			
			else if (line.contains("Exit:")) {
				line = line.replaceAll("Exit:", "");
				rooms.get(counter).setRoomExit(line);
				
			}
			
			else if (line.contains("ExitTo:")) {
				line = line.replaceAll("ExitTo:", "");
				rooms.get(counter).setExitIDs(line);
			}
			
			else if (line.contains("Demon:")) {
				line = line.replaceAll("Demon:", "");
				rooms.get(counter).addDemon(demonMap.get(line));
			
			}
			
			else if (line.equals("-")) {
				counter++;
			}
			
			
		} // End While Loop
		
		
	} // End Create Rooms Method
	
	
	static public void createItems() throws IOException, FileNotFoundException {
		
	}
	

}
