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


public GraphicalGui [] getGraphicalGuis () {
    Components comps [] = getComponents ();
    List < GraphicalGui > list = new ArrayList < GraphicalGui > ();
    if (comps == null) return null;
    for (Component c : comps) {
        if (c instanceof GraphicalGui) {
            list.add (c);
        }
    }
    return list.toArray (new GraphicalGui [list.size ()]);
}
