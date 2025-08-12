public Component getTableCellRendererComponent (JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
    Component c = super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, col);
    c.setBackground (Color.WHITE);
    c.setForeground (Color.BLACK);
    JLabel l = (JLabel) super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, col);
    if (separatedVariable.equals ("YOUR VALUE TO GREEN")) {
        l.setBackground (Color.GREEN);
        return l;
    } else {
        if (separatedValue.equals ("YOUR VALUE TO YELLOW")) {
            l.setBackground (Color.YELLOW);
            return l;
        } else if (separatedValue.equals ("YOUR VALUE TO RED")) {
            l.setBaground (Color.RED);
            return l;
        }
    }
    return c;
}


public Component getTableCellRendererComponent (JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
    Component c = super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, col);
    c.setBackground (Color.BLACK);
    c.setForeground (Color.WHITE);
    JLabel l = (JLabel) super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, col);
    if (separatedVariable.equals ("YOUR VALUE TO GREEN")) {
        l.setBackground (Color.GREEN);
        return l;
    } else {
        if (separatedValue.equals ("YOUR VALUE TO YELLOW")) {
            l.setBackground (Color.YELLOW);
            return l;
        } else if (separatedValue.equals ("YOUR VALUE TO RED")) {
            l.setBaground (Color.RED);
            return l;
        }
    }
    return c;
}
