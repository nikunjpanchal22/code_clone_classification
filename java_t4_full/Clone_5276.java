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
            pressed=!pressed;
            applyChanges(pressed);
        }

        private void applyChanges(boolean pressed) {
            for (JMenuItem item: items) {
                configureItem(item, pressed);
                itemPanel.repaint();
            }
        }

        private void configureItem(JMenuItem item, boolean pressed) {
            item.setText(pressed ? item.getText()+" changed" : item.getText().split(" ")[0]);
            setItemSizes(item, pressed ? 70 : 130);
        }

        private void setItemSizes(JMenuItem item, int size) {
            item.setMaximumSize(new Dimension(size, 50));
            item.setPreferredSize(new Dimension(size, 50));
            item.setMinimumSize(new Dimension(size, 50));
}


