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





public TerminalGui[] filterTerminalGui() {
      Collection<TerminalGui> result = new ArrayList<>();
      for (Component c : getComponents()) {
        if (c instanceof TerminalGui)
          result.add((TerminalGui) c);
      }
      return result.toArray(new TerminalGui[result.size()]);
}


