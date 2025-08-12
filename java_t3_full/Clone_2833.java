public static void main (String s []) throws VTDException, java.io.UnsupportedEncodingException, java.io.IOException {
    VTDGen vg = new VTDGen ();
    if (! vg.parseFile ("input.xml", false)) return;
    VTDNav vn = vg.getNav ();
    AutoPilot ap = new AutoPilot (vn);
    XMLModifier xm = new XMLModifier (vn);
    ap.selectXPath ("/*/place[@id=\"p14\" and   @initialMarking=\"2\"]/@initialMarking");
    int i = 0;
    while ((i = ap.evalXPath ()) != - 1) {
        xm.updateToken (i + 1, "499");
    }
    xm.output ("new.xml");
}


 

public static void main (String [] args) throws VTDException, IOException {
    VTDGen vg = new VTDGen ();
    String filePath = "input.xml";
    if (!vg.parseFile (filePath, false)) return;
    VTDNav vn = vg.getNav ();
    AutoPilot ap = new AutoPilot (vn);
    XMLModifier xm = new XMLModifier (vn);
    String xpathStr = "/*/place[@id='p14' and @initialMarking='2']/@initialMarking";
    ap.selectXPath (xpathStr);
    int i;
    while ((i = ap.evalXPath ()) != -1) {
        xm.updateToken (i+1, "499");
    }
    xm.output ("new.xml");
}


