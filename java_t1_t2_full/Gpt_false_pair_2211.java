public static final void main (String...args) {
    Node tree = new Node ();
    tree.value = "root";
    Node [] n = {new Node (), new Node ()};
    tree.nodes = n;
    tree.nodes [0].value = "leftish";
    tree.nodes [1].value = "rightish-leafy";
    Node [] nn = {new Node ()};
    tree.nodes [0].nodes = nn;
    tree.nodes [0].nodes [0].value = "off-leftish-leaf";
    System.out.println (Arrays.toString (list (tree, args [0]).toArray ()));
}


 public static final void main (String...args) {
    Node tree = new Node ();
    tree.value = "founder";
    Node [] n = {new Node (), new Node ()};
    tree.nodes = n;
    tree.nodes [0].value = "up-left";
    tree.nodes [1].value = "at-rightish-leaf";
    Node [] nn = {new Node ()};
    tree.nodes [0].nodes = nn;
    tree.nodes [0].nodes [0].value = "distant-leftish-leaf";
    System.out.println (Arrays.toString (list (tree, args [0]).toArray ()));
}
