/*
 * This is the base blueprint for all rooms. Each room has a unique room name, room ID, room number, and room difficulty.  The room difficulty determines how strong the demons will be in the 
 * room, and what kind of demons can spawn in there.
 */

package room;

import java.util.ArrayList;

import demonblueprint.BaseDemon;
import items.BaseItem;


public class BaseRoom {
	
	ArrayList<String> roomDesc = new ArrayList<String>();
	ArrayList<String> exits = new ArrayList<String>();
	ArrayList<String> exitIDs = new ArrayList<String>();
	ArrayList<BaseItem> roomItems = new ArrayList<BaseItem>();
	ArrayList<BaseDemon> roomDemons = new ArrayList<BaseDemon>();
	
	int roomNumber = -1;
	String roomID = "";
	String roomName = "";
	int roomDifficulty = 1;
	int roomWeight = 1; //The number of demons generated in the room cannot exceed the weight of the room
	

	
	
//Getters and Setters _______________________________________________________________
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	public void setRoomDifficulty(int difficulty) {
		this.roomDifficulty = difficulty;
	}
	
	public void setRoomWeight(int weight) {
		this.roomWeight = weight;
	}
	
	public void addRoomDesc(String roomDesc) {
		this.roomDesc.add(roomDesc);
	}
	
	public void addExit(String exit) {
		this.exits.add(exit);
	}
	
	public void addExitID (String exitID) {
		this.exitIDs.add(exitID);
	}
	
	public void addRoomDemon(BaseDemon demon) {
		this.roomDemons.add(demon);
	}
	
	public void addRoomItem() {
		this.roomItems.add(null);
	}
	
	public ArrayList<String> getRoomDescs() {
		return roomDesc;
	}
	
	public ArrayList<String> getRoomExits() {
		return exits;
	}
	
	public String getRoomName() {
		return roomName;
	}
	
	public int getNumExits() {
		return exits.size();
	}

	public ArrayList<String> getExitIDs() {
		return exitIDs;
	}
	
	public ArrayList<BaseDemon> getRoomDemons() {
		return roomDemons;
	}
	public String getExit(int index) {
		return exits.get(index);
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public String getRoomID() {
		return roomID;
	}
	
	public int getRoomDifficulty() {
		return roomDifficulty;
	}
	
	public int getRoomWeight() {
		return roomWeight;
	}

}
