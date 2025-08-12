public void actionPerformed (ActionEvent e) {
    Color c = label.getBackground ();
    if (FLASH_COLOR.equals (c)) {
        label.setBackground (null);
        label.setForeground (Color.black);
    } else {
        label.setBackground (FLASH_COLOR);
        label.setForeground (Color.white);
    }
}



 

public void actionPerformed(ActionEvent e) {
    Color c = label.getBackground();
    label.setBackground(c.equals(FLASH_COLOR) ? null : FLASH_COLOR);
    label.setForeground(c.equals(FLASH_COLOR) ? Color.black : Color.white);
}


