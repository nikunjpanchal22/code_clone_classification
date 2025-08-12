public TerminalGui [] getTerminalGuis () {
    Components comps [] = getComponents ();
    List < TerminalGui > list = new ArrayList < TerminalGui > ();
    if (comps == null) return null;
    for (Component c : comps) {
        if (c instanceof TerminalGui) {
            list.add (c);
        }
    }
    return list.toArray (new TerminalGui [list.size ()]);
}


 public TerminalGui[] getTerminalGuis() {
    List<TerminalGui> listTerminalGui = new ArrayList<>();
    if (getComponents() == null) return null;
    for (Component c : getComponents()) {
        if (c instanceof TerminalGui) {
            listTerminalGui.add((TerminalGui) c);
        }
    }
    return listTerminalGui.toArray(new TerminalGui[listTerminalGui.size()]);
}


