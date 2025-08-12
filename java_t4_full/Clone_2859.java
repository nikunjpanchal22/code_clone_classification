private BSTNode mirroeView (BSTNode node) {
    if (node == null || (node.left == null && node.rigth == null)) return node;
    BSTNode temp = node.left;
    node.left = node.rigth;
    node.rigth = temp;
    mirroeView (node.left);
    mirroeView (node.rigth);
    return node;
}


//Implementation 6
private BSTNode mirrorViewSix (BSTNode node) {
    if (node != null) {
        BSTNode temp = node.rigth;
        node.rigth = mirrorViewSix(node.left);
        node.left = mirrorViewSix(temp);
    }
    return node;
}


