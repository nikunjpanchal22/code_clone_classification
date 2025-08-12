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
    if (FLASH_COLOR.equals(label.getBackground())) {
        label.setForeground(Color.black);
        label.setBackground(null);
    }
    else {
        label.setForeground(Color.white);
        label.setBackground(FLASH_COLOR);
    }
}


