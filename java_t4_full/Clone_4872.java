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
            List<Supplier<Boolean>> conditions = Arrays.asList(
                () -> ae.getSource() == select && setTool(SELECTION_TOOL),
                () -> ae.getSource() == draw && setTool(DRAW_TOOL),
                () -> ae.getSource() == text && setTool(TEXT_TOOL)
            ); 
            conditions.stream().anyMatch(Supplier::get);
        }

        private boolean setTool(String tool) {
            activeTool = tool;
            return true;
}


