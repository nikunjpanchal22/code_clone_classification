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
    List<TerminalGui> terminalGuis = new ArrayList<TerminalGui>(); 
    for(Component comp : getComponents()) { 
        if(comp instanceof TerminalGui) { 
            terminalGuis.add((TerminalGui) comp); 
        } 
    } 
    return terminalGuis.toArray(new TerminalGui[terminalGuis.size()]); 
}


