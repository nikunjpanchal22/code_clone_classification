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
    label.setBackground(FLASH_COLOR.equals(label.getBackground()) ? null : FLASH_COLOR);
    label.setForeground(FLASH_COLOR.equals(label.getBackground()) ? Color.black : Color.white);
}


