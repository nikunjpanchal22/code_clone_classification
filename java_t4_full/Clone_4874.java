public void actionPerformed (ActionEvent ae) {
    if (ae.getSource () == select) {
        activeTool = SELECTION_TOOL;
    } else if (ae.getSource () == draw) {
        activeTool = DRAW_TOOL;
    } else if (ae.getSource () == text) {
        activeTool = TEXT_TOOL;
    }
}






public void actionPerformed (ActionEvent ae) {
    activeTool = (ae.getSource() == select) ? SELECTION_TOOL
                : (ae.getSource() == draw) ? DRAW_TOOL
                : (ae.getSource() == text) ? TEXT_TOOL
                : null;
}


