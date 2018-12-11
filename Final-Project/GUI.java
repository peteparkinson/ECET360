package socialnetwork;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }
    
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        loginTab = new javax.swing.JPanel();
        LTLoginLabel = new javax.swing.JLabel();
        LTUsernameLabel = new javax.swing.JLabel();
        LTPasswordLabel1 = new javax.swing.JLabel();
        LTUsernameField = new javax.swing.JTextField();
        LTLoginBtn = new javax.swing.JButton();
        LTSignUpLabel = new javax.swing.JLabel();
        LTNameLabel = new javax.swing.JLabel();
        LTDesiredUsernameLabel = new javax.swing.JLabel();
        LTPasswordLabel2 = new javax.swing.JLabel();
        LTVerifyLabel = new javax.swing.JLabel();
        LTNameField = new javax.swing.JTextField();
        LTDesiredUsernameField = new javax.swing.JTextField();
        LTSubmitBtn = new javax.swing.JButton();
        LTPasswordField1 = new javax.swing.JPasswordField();
        LTPasswordField2 = new javax.swing.JPasswordField();
        LTVerifyField = new javax.swing.JPasswordField();
        LTNetworkLabel = new javax.swing.JLabel();
        profileTab = new javax.swing.JPanel();
        PTPicturePane = new javax.swing.JScrollPane();
        PTPictureLabel = new javax.swing.JLabel();
        PTNameLabel = new javax.swing.JLabel();
        PTSeparator = new javax.swing.JSeparator();
        PTDeleteBtn = new javax.swing.JButton();
        PTStatusCBox = new javax.swing.JComboBox<>();
        PTStatusLabel = new javax.swing.JLabel();
        PTFriendsLabel = new javax.swing.JLabel();
        PTFriendsSPane = new javax.swing.JScrollPane();
        PTFriendsList = new javax.swing.JList<>();
        PTChangeBtn = new javax.swing.JButton();
        PTSaveBtn = new javax.swing.JButton();
        PTFriendsStatusLabel = new javax.swing.JLabel();
        PTFStatusLabel = new javax.swing.JLabel();
        PTUnfriendLabel = new javax.swing.JButton();
        searchTab = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        STAllLabel = new javax.swing.JLabel();
        STSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        STAllUsersPane = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        LTLoginLabel.setFont(new java.awt.Font("AR DESTINE", 1, 24)); // NOI18N
        LTLoginLabel.setText("Login");

        LTUsernameLabel.setText("Username:");

        LTPasswordLabel1.setText("Password:");

        LTUsernameField.setText("jTextField1");

        LTLoginBtn.setText("Login");

        LTSignUpLabel.setFont(new java.awt.Font("AR DESTINE", 1, 24)); // NOI18N
        LTSignUpLabel.setText("Join it");

        LTNameLabel.setText("Name:");

        LTDesiredUsernameLabel.setText("Username:");

        LTPasswordLabel2.setText("Password:");

        LTVerifyLabel.setText("Verify Password:");

        LTNameField.setText("jTextField3");

        LTDesiredUsernameField.setText("jTextField4");

        LTSubmitBtn.setText("Submit");

        LTPasswordField1.setText("jPasswordField1");

        LTPasswordField2.setText("jPasswordField2");

        LTVerifyField.setText("jPasswordField3");

        LTNetworkLabel.setFont(new java.awt.Font("AR DESTINE", 3, 48)); // NOI18N
        LTNetworkLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LTNetworkLabel.setText("The 90's Network");

        javax.swing.GroupLayout loginTabLayout = new javax.swing.GroupLayout(loginTab);
        loginTab.setLayout(loginTabLayout);
        loginTabLayout.setHorizontalGroup(
            loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginTabLayout.createSequentialGroup()
                        .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LTLoginLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginTabLayout.createSequentialGroup()
                                .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LTPasswordLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LTUsernameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LTUsernameField)
                                    .addComponent(LTPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                            .addComponent(LTLoginBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LTSignUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginTabLayout.createSequentialGroup()
                                .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LTNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LTDesiredUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LTDesiredUsernameField)
                                    .addComponent(LTNameField)))
                            .addGroup(loginTabLayout.createSequentialGroup()
                                .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginTabLayout.createSequentialGroup()
                                        .addComponent(LTVerifyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LTVerifyField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginTabLayout.createSequentialGroup()
                                        .addComponent(LTPasswordLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LTPasswordField2)))
                                .addGap(10, 10, 10)
                                .addComponent(LTSubmitBtn)))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginTabLayout.createSequentialGroup()
                        .addComponent(LTNetworkLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        loginTabLayout.setVerticalGroup(
            loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginTabLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(LTNetworkLabel)
                .addGap(107, 107, 107)
                .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginTabLayout.createSequentialGroup()
                        .addComponent(LTSignUpLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LTNameLabel)
                            .addComponent(LTNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LTDesiredUsernameLabel)
                            .addComponent(LTDesiredUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginTabLayout.createSequentialGroup()
                                .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LTPasswordLabel2)
                                    .addComponent(LTPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LTVerifyLabel)
                                    .addComponent(LTVerifyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(LTSubmitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginTabLayout.createSequentialGroup()
                        .addComponent(LTLoginLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LTUsernameLabel)
                            .addComponent(LTUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LTPasswordLabel1)
                            .addComponent(LTPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LTLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 116, 116))
        );

        jTabbedPane1.addTab("Login / Sign up", loginTab);

        PTPictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PTPictureLabel.setText("Picture Here");
        PTPicturePane.setViewportView(PTPictureLabel);

        PTNameLabel.setFont(new java.awt.Font("AR DESTINE", 1, 24)); // NOI18N
        PTNameLabel.setText("name here");

        PTDeleteBtn.setText("Delete Account");

        PTStatusCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        PTStatusLabel.setText("Current Status:");

        PTFriendsLabel.setText("Friends:");

        PTFriendsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        PTFriendsSPane.setViewportView(PTFriendsList);

        PTChangeBtn.setText("Change Status");

        PTSaveBtn.setText("Save");

        PTFriendsStatusLabel.setText("Friend's Status:");

        PTFStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PTFStatusLabel.setText("friends status here");

        PTUnfriendLabel.setText("Un-Friend");

        javax.swing.GroupLayout profileTabLayout = new javax.swing.GroupLayout(profileTab);
        profileTab.setLayout(profileTabLayout);
        profileTabLayout.setHorizontalGroup(
            profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileTabLayout.createSequentialGroup()
                        .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PTDeleteBtn)
                                .addGroup(profileTabLayout.createSequentialGroup()
                                    .addComponent(PTChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                    .addComponent(PTSaveBtn))
                                .addComponent(PTStatusCBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PTStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(PTPicturePane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(profileTabLayout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(PTUnfriendLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, profileTabLayout.createSequentialGroup()
                                .addComponent(PTFriendsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(profileTabLayout.createSequentialGroup()
                                        .addComponent(PTFriendsStatusLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PTFStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(PTFriendsSPane, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileTabLayout.createSequentialGroup()
                        .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PTNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PTSeparator))
                        .addContainerGap())))
        );
        profileTabLayout.setVerticalGroup(
            profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PTNameLabel)
                .addGap(18, 18, 18)
                .addComponent(PTSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(profileTabLayout.createSequentialGroup()
                        .addComponent(PTPicturePane)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PTStatusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PTStatusCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PTFriendsSPane, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(PTFriendsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PTChangeBtn)
                    .addComponent(PTSaveBtn)
                    .addComponent(PTFriendsStatusLabel)
                    .addComponent(PTFStatusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PTDeleteBtn)
                    .addComponent(PTUnfriendLabel))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Profile", profileTab);

        jLabel7.setFont(new java.awt.Font("AR DESTINE", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Search");

        STAllLabel.setFont(new java.awt.Font("AR DESTINE", 1, 24)); // NOI18N
        STAllLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STAllLabel.setText("All Users");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        STAllUsersPane.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel1.setText("Search by name:");

        jTextField1.setText("jTextField1");

        jButton1.setFont(new java.awt.Font("AR DESTINE", 1, 18)); // NOI18N
        jButton1.setText("Add Friend");

        javax.swing.GroupLayout searchTabLayout = new javax.swing.GroupLayout(searchTab);
        searchTab.setLayout(searchTabLayout);
        searchTabLayout.setHorizontalGroup(
            searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(STSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(STAllLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(STAllUsersPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        searchTabLayout.setVerticalGroup(
            searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(STAllLabel)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(STSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchTabLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(STAllUsersPane))
                .addGap(57, 57, 57))
        );

        jTabbedPane1.addTab("Search", searchTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify                     
    private javax.swing.JTextField LTDesiredUsernameField;
    private javax.swing.JLabel LTDesiredUsernameLabel;
    private javax.swing.JButton LTLoginBtn;
    private javax.swing.JLabel LTLoginLabel;
    private javax.swing.JTextField LTNameField;
    private javax.swing.JLabel LTNameLabel;
    private javax.swing.JLabel LTNetworkLabel;
    private javax.swing.JPasswordField LTPasswordField1;
    private javax.swing.JPasswordField LTPasswordField2;
    private javax.swing.JLabel LTPasswordLabel1;
    private javax.swing.JLabel LTPasswordLabel2;
    private javax.swing.JLabel LTSignUpLabel;
    private javax.swing.JButton LTSubmitBtn;
    private javax.swing.JTextField LTUsernameField;
    private javax.swing.JLabel LTUsernameLabel;
    private javax.swing.JPasswordField LTVerifyField;
    private javax.swing.JLabel LTVerifyLabel;
    private javax.swing.JButton PTChangeBtn;
    private javax.swing.JButton PTDeleteBtn;
    private javax.swing.JLabel PTFStatusLabel;
    private javax.swing.JLabel PTFriendsLabel;
    private javax.swing.JList<String> PTFriendsList;
    private javax.swing.JScrollPane PTFriendsSPane;
    private javax.swing.JLabel PTFriendsStatusLabel;
    private javax.swing.JLabel PTNameLabel;
    private javax.swing.JLabel PTPictureLabel;
    private javax.swing.JScrollPane PTPicturePane;
    private javax.swing.JButton PTSaveBtn;
    private javax.swing.JSeparator PTSeparator;
    private javax.swing.JComboBox<String> PTStatusCBox;
    private javax.swing.JLabel PTStatusLabel;
    private javax.swing.JButton PTUnfriendLabel;
    private javax.swing.JLabel STAllLabel;
    private javax.swing.JScrollPane STAllUsersPane;
    private javax.swing.JSeparator STSeparator1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel loginTab;
    private javax.swing.JPanel profileTab;
    private javax.swing.JPanel searchTab;
    // End of variables declaration                   
}
