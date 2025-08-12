public static void main (String [] s) throws VTDException {
    VTDGen vg = new VTDGen ();
    AutoPilot ap = new AutoPilot ();
    ap.selectXPath ("//part/*[text()]");
    if (! vg.parseFile ("d:\\xml\\soap.xml", false)) {
        System.out.println ("invalid xml");
        System.exit (0);
    }
    VTDNav vn = vg.getNav ();
    ap.bind (vn);
    int i = 0;
    while ((i = ap.evalXPath ()) != - 1) {
        System.out.println (" " + vn.toRawString (i) + " = " + vn.toNormalizedString (vn.getText ()));
    }
}





public static void main (String [] s) throws VTDException {
    VTDGen vg = new VTDGen ();
    AutoPilot ap = new AutoPilot ();
    ap.selectXPath ("//part/*[text()]");
    if (! vg.parseFile ("d:\\xml\\soap.xml", false)) {
        throw new VTDException("invalid xml");
    }
    VTDNav vn = vg.getNav ();
    ap.bind (vn);
    for (int i = ap.evalXPath(); i != -1; i = ap.evalXPath()) {
        String rawString = vn.toRawString (i);
        String normalizedString = vn.toNormalizedString (vn.getText ());
        System.out.println ("key " + rawString + " value " + normalizedString);
    }
}


