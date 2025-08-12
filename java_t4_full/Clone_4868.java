public void actionPerformed (ActionEvent ae) {
    if (ae.getSource () == select) {
        activeTool = SELECTION_TOOL;
    } else if (ae.getSource () == draw) {
        activeTool = DRAW_TOOL;
    } else if (ae.getSource () == text) {
        activeTool = TEXT_TOOL;
    }
}






public void actionPerformed(ActionEvent ae) {
    String action = ((JButton) ae.getSource()).getText().toUpperCase() + "_TOOL";
    try {
        Field field = this.getClass().getField(action);
        activeTool = (String) field.get(this);
    } catch (ReflectiveOperationException ignored) {}
}


