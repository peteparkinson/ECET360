/*****************************************
 * User.java
 * A Simple social network application for ECET370
 * rev. 1.0
 * Author: Pete Parkinson
 * 
 * this is the User class that contains private variables for each user.
 * variables include name, status, username, password, and a list of friends
 * 
 ****************************************/

package socialnetwork;

import java.util.ArrayList;

public class User {
	
	public static final String[] statuses = new String[] { "",
		"happy", 		"sad", 			"napping",
		"writing", 		"sleeping", 	"away",
		"dead", 		"alive", 		"hungry",
		"bored", 		"graduating", 	"working out",
		"slumming", 	"lazing", 		"painting",
		"travelling", 	"working", 		"other"	
	};
	
	public static User current = new User();
	
	private ArrayList<User> friends = new ArrayList<User>();	
	private String name;
	private int statusIndex;
	private String username;
	private String password;
	
	//default constructor
	public User(){
		
	}
	
	//fully parameterized constructor
	public User(String name, int statusIndex, String username, String password, ArrayList<User> friends){
		this.name = name;
		this.statusIndex = statusIndex;
		this.username = username;
		this.password = password;
		this.friends = friends;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getStatusIndex() {
		return statusIndex;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public ArrayList<User> getFriends() {
		return friends;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setStatusIndex(int statusIndex) {
		this.statusIndex = statusIndex;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFriends(ArrayList<User> friends) {
		this.friends = friends;
	}
	
	//other
	public void addFriend(User u) {
			friends.add(u);
	}
	public void removeFriend(User u) {
		friends.remove(u);
	}
	public String toString() {
		return name;
	}
}
