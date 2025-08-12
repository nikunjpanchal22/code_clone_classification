public static void main (String [] s) throws VTDException {
    VTDGen vg = new VTDGen ();
    if (! vg.parseFile ("input.xml", false)) return;
    VTDNav vn = vg.getNav ();
    AutoPilot ap = new AutoPilot (vn);
    ap.selectXPath ("/xml/item/@name");
    int i = 0;
    while ((i = ap.evalXPath ()) != - 1) {
        System.out.println (" item name is ===>" + vn.toString (i + 1));
    }
}




public static void main(String s[]) throws VTDException {
    VTDGen gen = new VTDGen();
    if (!gen.parseFile("input.xml", false)) return;
    VTDNav nav = gen.getNav();
    AutoPilot autoPilot = new AutoPilot(nav);
    autoPilot.selectXPath("/xml/item/@name");
    for (int idx = autoPilot.evalXPath(); idx != -1; idx = autoPilot.evalXPath())
        System.out.println("Item name: " + nav.toString(idx + 1));
}


