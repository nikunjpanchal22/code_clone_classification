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




public static void main(String[] args) throws VTDException {
    VTDGen vg = new VTDGen();
    if (!vg.parseFile("input.xml", false)) return;
    VTDNav vn = vg.getNav();
    AutoPilot ap = new AutoPilot();
    ap.bind(vn);
    String xpath = "/xml/item/@name";
    ap.selectXPath(xpath);
    for (int i = -1; (i = ap.evalXPath()) != -1;) 
        System.out.println("Item name: " + vn.toString(i + 1));
}


