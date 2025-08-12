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
    boolean isFlashColor = FLASH_COLOR.equals(label.getBackground());
    label.setBackground(isFlashColor ? null : FLASH_COLOR);
    label.setForeground(isFlashColor ? Color.black : Color.white);
}


