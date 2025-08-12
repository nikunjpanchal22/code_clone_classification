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





public TerminalGui [] extractTerminalGui () {
      Component [] comps = getComponents ();
      Queue < TerminalGui > queue = new ArrayDeque <>();
      for (Component c : comps) {
        if (c instanceof TerminalGui) {
          queue.add ((TerminalGui) c);
        }
      }
      TerminalGui [] terminalGuis = new TerminalGui [queue.size()];
      return queue.toArray (terminalGuis);
}


