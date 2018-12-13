# ECET360-final-project
A new user is taken to the login screen upon opening where they are prompted to either login to an existing account or create a new account.<br>
Duplicate user names are not allowed. <br>
Password fields have been used to limit visibility of the typed passwords.<br>
A verification field has been added for passwords of new accounts.<br><br>

Upon logging in, the user is taken to the “Profile” tab.<br>
The profile tab contains the user’s status, a button to change the status, a list of their <br>
friends and their selected friend’s status, a button to un-friend the selected friend, a button<br>
to logout, and a button to delete their account.  To change their status, the user will click <br>
“Change Status”, which enables a dropdown menu containing pre-defined statuses.<br>
The user can select a status, then click “Save” which will set their new status, <br>
which is visible to their friends.<br><br>

To add friends, the user will have to go to the “Search” tab, where they will be presented with 2 lists.<br>
The first list (left) being a list of all user’s names.  The second list (right) being a list of user’s<br>
names that contain the letters typed into the search field.  The selected user can then be added using the<br>
“Add Friend” button upon which an alert will appear informing the user that the addition has been completed.<br>
The new friend will now appear on the “Friends” list on the users profile tab.  Duplicate friends cannot be <br>
added.  The user cannot add themselves as a friend.<br><br>

Confirmation dialogs are presented to the user when logging out, un-friending, and deleting their account.<br>
Tabs and buttons are automatically enabled and disabled to prevent any unpredictable cross-behavior within the <br>
program.  For instance, before the user logs in, the profile tab is disabled.  Then, upon successful login or<br>
account creation, the login tab is disabled and the user is automatically taken to the profile tab.<br><br>

Dummy users have been added for demonstration purposes.  All dummy usernames and passwords can be found in the<br>
“Action.java” class, or on the following page.<br><br>

    	Username		  Password
	    jAdamsFamily	abc123
    	Bfrank76 	    abc123
    	blinkinAndNod	abc123
    	ZJed		      abc123
