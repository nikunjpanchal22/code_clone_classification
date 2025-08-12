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
    VTDGen vg = new VTDGen ("UTF-8");
    AutoPilot ap = new AutoPilot ();
    ap.declareXPathNameSpace("soap", "http://schemas.xmlsoap.org/soap/envelope/");
    ap.selectXPath ("/soap:Envelope/soap:Body//part/*[text()]");
    if (! vg.parseFile ("d:\\xml\\soap.xml", true))  
        throw new RuntimeException("invalid xml");       
    VTDNav vn = vg.getNav ();
    ap.bind (vn); 
    int i = -1;
    while ((i = ap.evalXPath ()) != -1)
        System.out.println (" " + vn.toString (i) + " = " + vn.toNormalizedString (vn.getText ()));
}


