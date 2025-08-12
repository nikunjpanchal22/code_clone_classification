public void actionPerformed (ActionEvent e) {
    StringBuilder s = new StringBuilder ();
    s.append (text1.getText ()).append ("\n").append (text2.getText ());
    System.out.println (s.toString ());
}


public void actionPerformed (ActionEvent e) {
    StringBuilder s = new StringBuilder ();
    s.append (text1.getText ()).append (",").append (text2.getText ());
    System.out.println (s.toString ());
}
