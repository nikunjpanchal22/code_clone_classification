public void actionPerformed (ActionEvent e) {
    pressed = ! pressed;
    if (pressed) {
        for (JMenuItem item : items) {
            item.setText (item.getText () + " changed");
            item.setMaximumSize (new Dimension (70, 50));
            item.setPreferredSize (new Dimension (70, 50));
            item.setMinimumSize (new Dimension (70, 50));
            itemPanel.invalidate ();
        }
    } else {
        for (JMenuItem item : items) {
            item.setText (item.getText ().substring (0, item.getText ().length () - 8));
            item.setMaximumSize (new Dimension (130, 50));
            item.setPreferredSize (new Dimension (130, 50));
            item.setMinimumSize (new Dimension (130, 50));
            itemPanel.invalidate ();
        }
    }
}




public void actionPerformed(ActionEvent e) {
    pressed = !pressed;
    for(JMenuItem item: items){
        String text = item.getText();
        item.setText(pressed ? text + " changed" : text.replace(" changed", ""));
        item.setSize(new Dimension(pressed ? 70 : 130, 50));
        itemPanel.repaint();
    }
}


