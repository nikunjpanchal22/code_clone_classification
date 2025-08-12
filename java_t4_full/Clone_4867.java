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
    switch(ae.getSource()){
        case select:
            activeTool = SELECTION_TOOL;
            break;
        case draw:
            activeTool = DRAW_TOOL;
            break;
        case text:
            activeTool = TEXT_TOOL;
            break;
    }
}


