/*****************************************
 * GUI.java
 * A Simple social network application for ECET370
 * rev. 1.0
 * Author: Pete Parkinson
 * 
 * this is the GUI class.  it contains all visual elements,
 * declarations, layouts, lists, etc.
 * 
 ****************************************/

package socialnetwork;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public GUI() {
        initComponents();
    }
                    
    private void initComponents() {

    	//Tabbed pane
        jtp = new JTabbedPane();
        
        //Tabs
        loginTab = new JPanel();
        profileTab = new JPanel();
        searchTab = new JPanel();
        
        //Labels
        LTLoginLabel = new JLabel();
        LTUsernameLabel = new JLabel();
        LTPasswordLabel1 = new JLabel();
        LTSignUpLabel = new JLabel();
        LTNameLabel = new JLabel();
        LTDesiredUsernameLabel = new JLabel();
        LTPasswordLabel2 = new JLabel();
        LTVerifyLabel = new JLabel();
        LTNetworkLabel = new JLabel();
        PTPictureLabel = new JLabel();
        PTNameLabel = new JLabel();
        PTStatusLabel = new JLabel();
        PTFriendsLabel = new JLabel();
        PTFriendsStatusLabel = new JLabel();
        PTFStatusLabel = new JLabel();
        STSearchLabel = new JLabel();
        STAllLabel = new JLabel();
        STNameLabel = new JLabel();
        
        //Fields
        LTUsernameField = new JTextField();
        LTNameField = new JTextField();
        LTDesiredUsernameField = new JTextField();
        STSearchField = new JTextField();

        LTPasswordField1 = new JPasswordField();
        LTPasswordField2 = new JPasswordField();
        LTVerifyField = new JPasswordField();
        
        //Buttons
        LTLoginBtn = new JButton();
        LTSubmitBtn = new JButton();
        PTDeleteBtn = new JButton();
        PTChangeBtn = new JButton();
        PTSaveBtn = new JButton();
        PTUnfriendBtn = new JButton();
        PTLogoutBtn = new JButton();
        STAddBtn = new JButton();
        
        //Scroll panes
        PTPicturePane = new JScrollPane();
        PTFriendsSPane = new JScrollPane();
        STAllUsersPane = new JScrollPane();
        STSearchPane = new JScrollPane();
        
        //Separators
        PTSeparator = new JSeparator();
        STSeparator1 = new JSeparator();
        STSeparator2 = new JSeparator();
        
        //ComboBoxes
        PTStatusCBox = new JComboBox<>();
        
        //Lists
        PTFriendsList = new JList<>();
        STAllUsersList = new JList<>();
        STSearchList = new JList<>();

        //Frame dimensions
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new Dimension(800, 600));
        setMinimumSize(new Dimension(800, 600));
        setPreferredSize(new Dimension(800, 600));
        setResizable(false);
        
        
        /*************************************************
         * Login tab elements
         ************************************************/
        
        LTLoginLabel.setFont(new Font("AR DESTINE", 1, 24));
        LTLoginLabel.setText("Login");
        LTUsernameLabel.setText("Username:");
        LTPasswordLabel1.setText("Password:");
        LTSignUpLabel.setFont(new Font("AR DESTINE", 1, 24));
        LTSignUpLabel.setText("Join it");
        LTNameLabel.setText("Name:");
        LTVerifyLabel.setText("Verify Password:");
        LTDesiredUsernameLabel.setText("Username:");
        LTPasswordLabel2.setText("Password:");
        LTNetworkLabel.setFont(new Font("AR DESTINE", 3, 48));
        LTNetworkLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LTNetworkLabel.setText("The 90's Network");
        
        LTUsernameField.setText("");
        LTNameField.setText("");
        LTDesiredUsernameField.setText("");
        LTPasswordField1.setText("");
        LTPasswordField2.setText("");
        LTVerifyField.setText("");

        LTLoginBtn.setText("Login");
        LTLoginBtn.addActionListener(new Action());
        LTSubmitBtn.setText("Submit");
        LTSubmitBtn.addActionListener(new Action());


        /*************************************************
         * Draw login tab
         ************************************************/
        GroupLayout loginTabLayout = new GroupLayout(loginTab);
        loginTab.setLayout(loginTabLayout);
        loginTabLayout.setHorizontalGroup(
            loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(loginTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(loginTabLayout.createSequentialGroup()
                        .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(LTLoginLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, loginTabLayout.createSequentialGroup()
                                .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LTPasswordLabel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LTUsernameLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(LTUsernameField)
                                    .addComponent(LTPasswordField1, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                            .addComponent(LTLoginBtn, GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(LTSignUpLabel, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginTabLayout.createSequentialGroup()
                                .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LTNameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LTDesiredUsernameLabel, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(LTDesiredUsernameField)
                                    .addComponent(LTNameField)))
                            .addGroup(loginTabLayout.createSequentialGroup()
                                .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(GroupLayout.Alignment.LEADING, loginTabLayout.createSequentialGroup()
                                        .addComponent(LTVerifyLabel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LTVerifyField))
                                    .addGroup(GroupLayout.Alignment.LEADING, loginTabLayout.createSequentialGroup()
                                        .addComponent(LTPasswordLabel2, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LTPasswordField2)))
                                .addGap(10, 10, 10)
                                .addComponent(LTSubmitBtn)))
                        .addGap(63, 63, 63))
                    .addGroup(GroupLayout.Alignment.TRAILING, loginTabLayout.createSequentialGroup()
                        .addComponent(LTNetworkLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        loginTabLayout.setVerticalGroup(
            loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, loginTabLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(LTNetworkLabel)
                .addGap(107, 107, 107)
                .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(loginTabLayout.createSequentialGroup()
                        .addComponent(LTSignUpLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(LTNameLabel)
                            .addComponent(LTNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(LTDesiredUsernameLabel)
                            .addComponent(LTDesiredUsernameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginTabLayout.createSequentialGroup()
                                .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(LTPasswordLabel2)
                                    .addComponent(LTPasswordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(LTVerifyLabel)
                                    .addComponent(LTVerifyField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(LTSubmitBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(GroupLayout.Alignment.TRAILING, loginTabLayout.createSequentialGroup()
                        .addComponent(LTLoginLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(LTUsernameLabel)
                            .addComponent(LTUsernameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginTabLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(LTPasswordLabel1)
                            .addComponent(LTPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LTLoginBtn, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 116, 116))
        );



        /*************************************************
         * Profile tab elements
         ************************************************/
        
        PTPictureLabel.setHorizontalAlignment(SwingConstants.CENTER);
        PTPictureLabel.setText("Picture Here");
        PTNameLabel.setFont(new Font("AR DESTINE", 1, 24));
        PTNameLabel.setText("name here");
        PTStatusLabel.setText("Current Status:");
        PTFriendsLabel.setText("Friends:");
        PTFStatusLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        PTFStatusLabel.setText("");
        PTFriendsStatusLabel.setText("Friend's Status:");

        PTDeleteBtn.setText("Delete Account");
        PTDeleteBtn.addActionListener(new Action());
        PTChangeBtn.setText("Change Status");
        PTChangeBtn.addActionListener(new Action());
        PTSaveBtn.setEnabled(false);
        PTSaveBtn.setText("Save");
        PTSaveBtn.addActionListener(new Action());
        PTUnfriendBtn.setText("Un-Friend");
        PTUnfriendBtn.addActionListener(new Action());
        PTLogoutBtn.setText("Log Out");
        PTLogoutBtn.addActionListener(new Action());

        PTStatusCBox.setEnabled(false);
        PTStatusCBox.setModel(new DefaultComboBoxModel<>(User.statuses));

        PTFriendsList.setModel(friendsModel);
        PTFriendsList.addListSelectionListener(new Action());

        PTPicturePane.setViewportView(PTPictureLabel);
        PTFriendsSPane.setViewportView(PTFriendsList);


        /*************************************************
         * Draw profile tab
         ************************************************/
        
        GroupLayout profileTabLayout = new GroupLayout(profileTab);
        profileTab.setLayout(profileTabLayout);
        profileTabLayout.setHorizontalGroup(
            profileTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(profileTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(profileTabLayout.createSequentialGroup()
                        .addGroup(profileTabLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.LEADING, profileTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(profileTabLayout.createSequentialGroup()
                                    .addComponent(PTDeleteBtn)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PTLogoutBtn))
                                .addGroup(profileTabLayout.createSequentialGroup()
                                    .addComponent(PTChangeBtn)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                    .addComponent(PTSaveBtn))
                                .addComponent(PTStatusCBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PTStatusLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(PTPicturePane, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addGroup(profileTabLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(profileTabLayout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(PTUnfriendBtn))
                            .addGroup(GroupLayout.Alignment.LEADING, profileTabLayout.createSequentialGroup()
                                .addComponent(PTFriendsLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(profileTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(profileTabLayout.createSequentialGroup()
                                        .addComponent(PTFriendsStatusLabel)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PTFStatusLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(PTFriendsSPane, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60))
                    .addGroup(GroupLayout.Alignment.TRAILING, profileTabLayout.createSequentialGroup()
                        .addGroup(profileTabLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(PTNameLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PTSeparator))
                        .addContainerGap())))
        );
        profileTabLayout.setVerticalGroup(
            profileTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(profileTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PTNameLabel)
                .addGap(18, 18, 18)
                .addComponent(PTSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(profileTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(profileTabLayout.createSequentialGroup()
                        .addComponent(PTPicturePane)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PTStatusLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PTStatusCBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(PTFriendsSPane, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(PTFriendsLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profileTabLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PTChangeBtn)
                    .addComponent(PTSaveBtn)
                    .addComponent(PTFriendsStatusLabel)
                    .addComponent(PTFStatusLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(profileTabLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PTDeleteBtn)
                    .addComponent(PTUnfriendBtn)
                    .addComponent(PTLogoutBtn))
                .addContainerGap())
        );


        /*************************************************
         * Search tab elements
         ************************************************/
        
        STSearchLabel.setFont(new Font("AR DESTINE", 1, 24));
        STSearchLabel.setHorizontalAlignment(SwingConstants.CENTER);
        STSearchLabel.setText("Search");
        STAllLabel.setFont(new Font("AR DESTINE", 1, 24));
        STAllLabel.setHorizontalAlignment(SwingConstants.CENTER);
        STAllLabel.setText("All Users");
        STNameLabel.setText("Search by name:");

        STSearchField.setText("");
        STSearchField.addKeyListener(new Action());

        STAddBtn.setFont(new Font("AR DESTINE", 1, 18));
        STAddBtn.setText("Add Friend");
        STAddBtn.setEnabled(false);
        STAddBtn.addActionListener(new Action());

        STAllUsersList.setModel(allUsersModel);
    	STAllUsersList.setEnabled(false);
        STSearchList.setModel(searchModel);

        STAllUsersPane.setViewportView(STAllUsersList);
        STSearchPane.setViewportView(STSearchList);


        /*************************************************
         * Draw search tab
         ************************************************/
        
        GroupLayout searchTabLayout = new GroupLayout(searchTab);
        searchTab.setLayout(searchTabLayout);
        searchTabLayout.setHorizontalGroup(
            searchTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, searchTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchTabLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(STSeparator1, GroupLayout.Alignment.LEADING)
                    .addComponent(STAllLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(STAllUsersPane))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(searchTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, searchTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(STSearchLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(STSeparator2, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                        .addComponent(STSearchPane)
                        .addComponent(STNameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(STSearchField))
                    .addComponent(STAddBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        searchTabLayout.setVerticalGroup(
            searchTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(searchTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchTabLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(STAllLabel)
                    .addComponent(STSearchLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(STSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                    .addComponent(STSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchTabLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(searchTabLayout.createSequentialGroup()
                        .addComponent(STNameLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(STSearchField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(STSearchPane, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(STAddBtn, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
                    .addComponent(STAllUsersPane))
                .addGap(57, 57, 57))
        );

        jtp.addTab("Login / Sign up", loginTab);
        jtp.addTab("Profile", profileTab);
        jtp.addTab("Search", searchTab);

        //disable profile tab until successful login
        jtp.setEnabledAt(1, false);
        
        /*************************************************
         * Configure jTabbedPane / frame
         ************************************************/
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtp)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtp)
                .addContainerGap())
        );

        pack();
    }

    

    // Variable declarations       
    //Login tab
    private JLabel LTDesiredUsernameLabel;
    private JLabel LTLoginLabel;
    private JLabel LTNameLabel;
    private JLabel LTNetworkLabel;
    private JLabel LTPasswordLabel1;
    private JLabel LTPasswordLabel2;
    private JLabel LTSignUpLabel;
    private JLabel LTUsernameLabel;
    private JLabel LTVerifyLabel;
    static JTextField LTDesiredUsernameField;
    static JTextField LTNameField;
    static JTextField LTUsernameField;
    static JPasswordField LTPasswordField1;
    static JPasswordField LTPasswordField2;
    static JPasswordField LTVerifyField;
    static JButton LTLoginBtn;
    static JButton LTSubmitBtn;
    
    //Profile tab
    static JLabel PTFStatusLabel;
    private JLabel PTFriendsLabel;
    private JLabel PTFriendsStatusLabel;
    static JLabel PTNameLabel;
    private JLabel PTPictureLabel;
    private JLabel PTStatusLabel;
    static JButton PTChangeBtn;
    static JButton PTDeleteBtn;
    static JButton PTSaveBtn;
    static JButton PTUnfriendBtn;
    static JButton PTLogoutBtn;
    private JSeparator PTSeparator;
    static JComboBox<String> PTStatusCBox;
    static JList<User> PTFriendsList;
    private JScrollPane PTFriendsSPane;
    private JScrollPane PTPicturePane;
    
    //Search tab
    private JLabel STAllLabel;
    private JLabel STNameLabel;
    private JLabel STSearchLabel;
    static JTextField STSearchField;
    static JButton STAddBtn;
    private JSeparator STSeparator1;
    private JSeparator STSeparator2;
    private JList<User> STAllUsersList;
    static JList<User> STSearchList;
    private JScrollPane STAllUsersPane;
    private JScrollPane STSearchPane;
    
    //List models
	static DefaultListModel<User> allUsersModel   = new DefaultListModel<User>();
	static DefaultListModel<User> friendsModel    = new DefaultListModel<User>();
	static DefaultListModel<User> searchModel     = new DefaultListModel<User>();
    
    private JPanel loginTab;
    private JPanel profileTab;
    private JPanel searchTab;
    
    static JTabbedPane jtp;

}
