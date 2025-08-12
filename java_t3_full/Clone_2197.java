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
    List<TerminalGui> terminalGuiList = new ArrayList<TerminalGui>(); 
    Component[] components = getComponents(); 
    if (components == null) return null; 
    for (Component c : components) { 
        if (c instanceof TerminalGui) terminalGuiList.add((TerminalGui) c); 
    } 
    return terminalGuiList.toArray(new TerminalGui[terminalGuiList.size()]); 
} 


