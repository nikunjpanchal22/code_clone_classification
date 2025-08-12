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





public TerminalGui[] arrangeTerminalGui() {
    List<TerminalGui> terminalGuis = new ArrayList<>();
    for (Component c : getComponents()) {
        if (c instanceof TerminalGui)
            terminalGuis.add((TerminalGui) c);
    }
    return terminalGuis.toArray(new TerminalGui[0]);
}


