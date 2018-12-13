/*****************************************
 * Action.java
 * A Simple social network application for ECET370
 * rev. 1.0
 * Author: Pete Parkinson
 * 
 * this is the Action class.
 * it contains all button functionality and almost all of the logic for the application.
 * 
 ****************************************/

package socialnetwork;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Action implements ActionListener, KeyListener, ListSelectionListener {
		
	public void actionPerformed(ActionEvent e) {
    	

    	//login button
    	if(e.getSource() == GUI.LTLoginBtn) {
    		String uname = GUI.LTUsernameField.getText();
    		String pass = String.valueOf(GUI.LTPasswordField1.getPassword());
    		for(int i = 0; i < GUI.allUsersModel.size(); i++) {
    			User u = GUI.allUsersModel.get(i);
        		if(u.getUsername().equals(uname) && u.getPassword().equals(pass)) {
        			User.current = GUI.allUsersModel.get(i);
                    login(User.current);
        			return;
        		}
    		}
			String message = "Invalid username or password.";
		    JOptionPane.showMessageDialog(null, message);
    	}
    	
    	//Submit new user button
    	else if(e.getSource() == GUI.LTSubmitBtn) {
    		
    		//username must be unique
    		for(int i = 0; i < GUI.allUsersModel.getSize(); i++) {
    			String tmp = GUI.allUsersModel.get(i).getUsername();
        		if(tmp.equals(GUI.LTDesiredUsernameField.getText())) {
        			String message = "This username is already taken.";
        		    JOptionPane.showMessageDialog(null, message);
        		    return;
        		}
    		}
    		
    		//passwords must match
    		if(!String.valueOf(GUI.LTPasswordField2.getPassword()).equals
    				(String.valueOf(GUI.LTVerifyField.getPassword()))) {
    			System.out.println(GUI.LTPasswordField2.getPassword());
    			System.out.println(GUI.LTVerifyField.getPassword());
    			String message = "Your passwords don't match.";
    		    JOptionPane.showMessageDialog(null, message);
    		    return;
    		}
    		
    		//all fields must have values
    		if(GUI.LTNameField.getText().equals("") ||
    		   GUI.LTDesiredUsernameField.getText().equals("") ||
    		   String.valueOf(GUI.LTPasswordField2.getPassword()).equals("")) {
    			String message = "Please enter values in all fields.";
    		    JOptionPane.showMessageDialog(null, message);
    		    return;
    		}
    		
    		//if all criteria is met, submit new user
    		String name = GUI.LTNameField.getText();
    		String username = GUI.LTDesiredUsernameField.getText();
    		String password = String.valueOf(GUI.LTPasswordField2.getPassword());
    		
    		User.current = new User(name, 0, username, password, new ArrayList<User>());
    		GUI.allUsersModel.addElement(User.current);
            
            login(User.current);
            
    	}
    	//Delete profile button
    	else if(e.getSource() == GUI.PTDeleteBtn) {
			String message = new String("Are you sure you would like to delete your account?");
		    int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.YES_OPTION) {
	    		GUI.allUsersModel.remove(GUI.allUsersModel.indexOf(User.current));
	    		logout();
	        }
    	}
    	//Log out button
    	else if(e.getSource() == GUI.PTLogoutBtn) {
			String message = new String("Are you sure you would like to log out?");
		    int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.YES_OPTION) {
	    		User.current = new User();
	            GUI.jtp.setEnabledAt(1, false);
	            GUI.jtp.setEnabledAt(0, true);
	            GUI.jtp.setSelectedIndex(0);
	        }
    	}
    	//Change status button
    	else if(e.getSource() == GUI.PTChangeBtn) {
    		GUI.PTStatusCBox.setEnabled(true);
    		GUI.PTSaveBtn.setEnabled(true);
    		GUI.PTDeleteBtn.setEnabled(false);
    		GUI.PTLogoutBtn.setEnabled(false);
    		GUI.PTChangeBtn.setEnabled(false);
    		GUI.PTUnfriendBtn.setEnabled(false);
    	}
    	//Save status button
    	else if(e.getSource() == GUI.PTSaveBtn) {
    		User.current.setStatusIndex(GUI.PTStatusCBox.getSelectedIndex());
    		resetPT();
    	}
    	//Un-friend button
    	else if(e.getSource() == GUI.PTUnfriendBtn) {
    		User u = GUI.PTFriendsList.getSelectedValue();
			String message = new String("Are you sure you would like un-friend " + u.getName() + " ?");
		    int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.YES_OPTION) {
	    		User.current.removeFriend(u);
	    		updateFriendsList();
	        }
    		
    	}
    	//Add friend button
    	else if(e.getSource() == GUI.STAddBtn) {
    		User u = GUI.STSearchList.getSelectedValue();
    		if(User.current ==  u) {
    			return;
    		} 
    		if(!User.current.getFriends().contains(u)) {
        		User.current.addFriend(GUI.STSearchList.getSelectedValue());
        		updateFriendsList();
    			String message = GUI.STSearchList.getSelectedValue().getName() + " is now your friend!";
    		    JOptionPane.showMessageDialog(null, message);
    		} else {
    			String message = GUI.STSearchList.getSelectedValue().getName() + " is already your friend!";
    		    JOptionPane.showMessageDialog(null, message);
    		}
    	}

    }

	//Misc. methods

	private void resetPT() {
		GUI.PTStatusCBox.setEnabled(false);
		GUI.PTSaveBtn.setEnabled(false);
		GUI.PTDeleteBtn.setEnabled(true);
		GUI.PTLogoutBtn.setEnabled(true);
		GUI.PTChangeBtn.setEnabled(true);
		GUI.PTUnfriendBtn.setEnabled(true);
		
	}
	
	private void resetLT() {
		GUI.LTUsernameField.setText("");
		GUI.LTPasswordField1.setText("");
		GUI.LTPasswordField2.setText("");
		GUI.LTVerifyField.setText("");
		GUI.LTNameField.setText("");
		GUI.LTDesiredUsernameField.setText("");
		
	}
	
	private void login(User u) {
        GUI.STAddBtn.setEnabled(true);
        GUI.jtp.setEnabledAt(1, true);
        GUI.jtp.setEnabledAt(0, false);
        GUI.PTNameLabel.setText(u.getName());
        GUI.PTStatusCBox.setSelectedIndex(u.getStatusIndex());
        if(u.getFriends() != null) {
            for(int i = 0; i < u.getFriends().size(); i++) {
                GUI.friendsModel.addElement(u.getFriends().get(i));
            }
        }
        GUI.jtp.setSelectedIndex(1);
        resetLT();
	}

	private void logout() {
		User.current = new User();
        GUI.STAddBtn.setEnabled(false);
        GUI.jtp.setEnabledAt(1, false);
        GUI.jtp.setEnabledAt(0, true);
        GUI.jtp.setSelectedIndex(0);
        resetLT();
	}
	
	public void updateFriendsList() {
		GUI.friendsModel.clear();
		GUI.PTFriendsList.clearSelection();
		for(int i = 0; i < User.current.getFriends().size(); i++) {
			GUI.friendsModel.addElement(User.current.getFriends().get(i));
		}
	}
	
    public static void init() {
    	User u = new User("John Adams", 3, "jAdamsFamily", "abc123", new ArrayList<User>());
    	GUI.allUsersModel.addElement(u);
    	u = new User("Ben Franklin", 4, "Bfrank76", "abc123", new ArrayList<User>());
    	GUI.allUsersModel.addElement(u);
    	u = new User("Abraham Lincoln", 12, "blinkinAndNod", "abc123", new ArrayList<User>());
    	GUI.allUsersModel.addElement(u);
    	u = new User("J Edgar Hoover", 15, "ZJed", "abc123", new ArrayList<User>());
    	GUI.allUsersModel.addElement(u);
    	
    }
    
    //Overridden listener methods
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(e.getSource() == GUI.PTFriendsList) {
			if(GUI.PTFriendsList.getSelectedIndex() == -1) {
				GUI.PTFStatusLabel.setText("");
			} else {
				GUI.PTFStatusLabel.setText(User.statuses
					[GUI.PTFriendsList.getSelectedValue().getStatusIndex()]);
			}
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//search function
		if(e.getSource() == GUI.STSearchField) {
			GUI.searchModel.clear();
			String searchFor = GUI.STSearchField.getText().toUpperCase();
			for(int i = 0; i < GUI.allUsersModel.size(); i++) {
				User u = GUI.allUsersModel.getElementAt(i);
				if(u.getName().toUpperCase().contains(searchFor)) {
					GUI.searchModel.addElement(u);
				}
			}
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
