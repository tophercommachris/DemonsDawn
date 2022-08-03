package room;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class RoomBuilder {
	
	ArrayList<BaseRoom> rooms = new ArrayList<BaseRoom>();
	String line;
	int counter;
	File roomFile;
	BufferedReader roomReader;
	
	public RoomBuilder() throws FileNotFoundException{
	roomFile = new File("roomList.txt");
	roomReader = new BufferedReader(new FileReader(roomFile));
	counter = 1;
	}
	
	//Constructs the rooms frm the roomList file.  For simplicity, a blank room at index 0
	// is added in order for the rooms to start at 1, and not 0.  
	public ArrayList<BaseRoom> construct() throws IOException {
		rooms.add(new BaseRoom());
		
		while ((line = roomReader.readLine()) != null) {
			
			
			if (line.contains("Number:")) {
				rooms.add(new BaseRoom());
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
				rooms.get(counter).addRoomDesc(line);
				
			}
			
			else if (line.contains("Exit:")) {
				line = line.replaceAll("Exit:", "");
				rooms.get(counter).addExit(line);
				
			}
			
			else if (line.contains("ExitTo:")) {
				line = line.replaceAll("ExitTo:", "");
				rooms.get(counter).addExitID(line);
			}
			
			else if (line.contains("RoomDifficulty;")) {
				line = line.replaceAll("RoomDifficulty:", "");
				rooms.get(counter).setRoomDifficulty(Integer.parseInt(line));
			}
			
			else if (line.contains("RoomWeight:")) {
				line = line.replaceAll("RoomWeight:", "");
				rooms.get(counter).setRoomWeight(Integer.parseInt(line));
			}
			
			else if (line.equals("-")) {
				counter++;
			}
			
			
		} // End While Loop
		
		
		return rooms;
		
	}

}
