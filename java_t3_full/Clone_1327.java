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
    java.util.HashMap<Integer, String> textMap = new java.util.HashMap<Integer, String> ();
    int i = 0;
    while ((i = ap.evalXPath ()) != -1) { 
        textMap.put(i, vn.toNormalizedString(vn.getText ()) );
    }

    java.util.Set<Integer> keys = textMap.keySet();
    for (Integer iKey : keys) {
        System.out.println (vn.toRawString(iKey) + " = " + textMap.get(iKey));
    }
}


