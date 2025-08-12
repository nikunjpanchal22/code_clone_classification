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
            updateItems(pressed);
        }

        private void updateItems(boolean isPressed) {
            for (JMenuItem item: items) {
                String text = isPressed ? item.getText() + " changed" : item.getText().split(" ")[0];
                Dimension size = new Dimension(isPressed ? 70 : 130, 50);
                configureItem(item, text, size);
                itemPanel.revalidate();
            }
        }

        private void configureItem(JMenuItem item, String text, Dimension size) {
            item.setText(text);
            item.setMaximumSize(size);
            item.setPreferredSize(size);
            item.setMinimumSize(size);
}


