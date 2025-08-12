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


public TerminalGui [] getTerminalGuis () {
    Components comps [] = getComponents ();
    LinkedList < TerminalGui > linkedList = new LinkedList < TerminalGui > ();
    if (comps == null) return null;
    for (Component c : comps) {
        if (c instanceof TerminalGui) {
            linkedList.add (c);
        }
    }
    return linkedList.toArray (new TerminalGui [linkedList.size ()]);
}
