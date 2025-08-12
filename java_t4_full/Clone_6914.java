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





public TerminalGui [] retrieveTerminalGui () {
  return Arrays.asList(getComponents())
               .stream()
               .filter(c -> c instanceof TerminalGui)
               .toArray(TerminalGui[]::new);
}


