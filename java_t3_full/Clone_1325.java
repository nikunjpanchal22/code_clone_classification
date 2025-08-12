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
        System.out.println ("invalid xml");
        System.exit (0);
    }
    VTDNav vn = vg.getNav ();
    ap.bind (vn);
    int i = 0;
    String sTagName;
    String sTextValue;
    int offset;
    while ((i = ap.evalXPath ()) != - 1) {
        sTagName = vn.toString (i);
        sTextValue = vn.toNormalizedString (vn.getText ());
        offset = vn.getTextOffset ();
        System.out.println(" "+sTagName+" = "+sTextValue+" Offset: "+offset);
    }
}


