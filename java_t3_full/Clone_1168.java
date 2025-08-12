public void run () {
    JMenuBar menuBar = new JMenuBar ();
    JMenu menu = new JMenu ("A regular menu");
    menu.add (new JMenuItem ("Menu item"));
    JMenu gridMenu = new JMenu ("Menu with grid");
    gridMenu.getPopupMenu ().setLayout (new GridLayout (2, 2));
    gridMenu.add ("Top left");
    gridMenu.add ("Top right");
    gridMenu.add ("Bottom left");
    gridMenu.add ("Bottom right");
    menu.add (gridMenu);
    menuBar.add (menu);
    JFrame frame = new JFrame ("Menus");
    frame.setJMenuBar (menuBar);
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.pack ();
    frame.setVisible (true);
}


 public void run () {JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Main Menu");
    JMenuItem menuItem1 = new JMenuItem("Option 1");
    JMenuItem menuItem2 = new JMenuItem("Option 2");
    menu.add(menuItem1);
    menu.add(menuItem2);
    menu.addSeparator();
    JMenu gridMenu = new JMenu("Grid Menu");
    gridMenu.getPopupMenu().setLayout(new GridLayout(2,2));
    gridMenu.add(new JMenuItem("Top Left"));
    gridMenu.add(new JMenuItem("Top Right"));
    gridMenu.add(new JMenuItem("Bottom Left"));
    gridMenu.add(new JMenuItem("Bottom Right"));
    menu.add(gridMenu);
    JFrame frame = new JFrame("Menus");
    frame.setJMenuBar(menuBar);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}


