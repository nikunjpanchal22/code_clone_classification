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
    List<TerminalGui> terminalList = new ArrayList<TerminalGui>();
    if (getComponents() == null) return null;
    Component[] comps = getComponents();
    for (Component c : comps) {
        if (c instanceof TerminalGui) {
            terminalList.add((TerminalGui) c);
        }
    }
    return terminalList.toArray(new TerminalGui[terminalList.size()]);
}


