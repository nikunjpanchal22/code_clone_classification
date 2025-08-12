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
            processItems(pressed);
        }

        private void processItems(boolean isPressed) {
            int size = isPressed ? 70: 130;
            String addedText = isPressed ? " changed": "";
            for (JMenuItem item: items) {
                item.setText(item.getText() + addedText);
                item.setSize(new Dimension(size, 40));
                itemPanel.validate();
            }
}


