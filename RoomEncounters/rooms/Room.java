/*
 * This class holds all the information regarding the rooms the player navigates.  
 * This class is called as a static class, and will hold a variety of different things such as Demons, Shopkeepers, and items
 */

package rooms;
import java.util.ArrayList;
import java.util.HashMap;
import items.Item;
import demons.*;

public class Room {
	
	
	
	ArrayList<String> roomDesc = new ArrayList<String>();
	ArrayList<String> exits = new ArrayList<String>();
	ArrayList<String> exitIDs = new ArrayList<String>();
	ArrayList<Item> roomItems = new ArrayList<Item>();
	ArrayList<Demon> roomDemons = new ArrayList<Demon>();
	int roomNumber;
	String roomID;
	String roomName;
	
	public void addDemon(Demon demon) {
		roomDemons.add(demon);
	}
	
	public void checkForDemons() {
		String[] nameDescHolder = new String[2];
			if (roomDemons.isEmpty())
				System.out.println("\nThere are no demons in the room\n");
			else {
				System.out.println("There are " + (roomDemons.size()) + " demon(s) in the room\n");
				for (int i = 0; i < roomDemons.size(); i++) {
					nameDescHolder = roomDemons.get(i).getNameDesc();

					System.out.print((i+1) + ": " + nameDescHolder[0] + "- ");
					System.out.println(nameDescHolder[1] + "\n\n");
				}
			}
		
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getRoomNumber(String roomID) {
		if (this.roomID.equals(roomID)) {
			return roomNumber;
		}
		else
			return -1;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public String getRoomID() {
		return roomID;
	}
	
	public void setRoomID(String room) {
		roomID = room;
	}

	public ArrayList<String> getRoomDesc() {
		return roomDesc;
	}

	public void setRoomDesc(String desc) {
		roomDesc.add(desc);
	}
	
	public String getRoomName() {
		return roomName;
	}
	
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	public ArrayList<String> getRoomExit() {
		return exits;
	}
	
	public void setRoomExit(String exit) {
		exits.add(exit);
	}
	
	public int getNumExits() {
		return exits.size();
	}
	
	public String getExit(int index) {
		return exits.get(index);
	}
	
	public void setExitIDs(String ID) {
		exitIDs.add(ID);
		
	}
	
	public String getExitIDs(int index) {
		return exitIDs.get(index);
	}

}
