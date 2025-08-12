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



public void actionPerformed(ActionEvent e){
            pressed = !pressed;
            setupMenuItems(pressed);
        }

        private void setupMenuItems(boolean pressed) {
            for(JMenuItem menuItem:items){
                setupMenuItem(menuItem, pressed);
                itemPanel.validate();
            }
        }

        private void setupMenuItem(JMenuItem menuItem, boolean pressed) {
            String optionText = pressed ? " changed" : "";
            int optionDimension = pressed ? 70 : 130;
            menuItem.setText(menuItem.getText() + optionText);
            menuItem.setSize(new Dimension(optionDimension, 50));
}


