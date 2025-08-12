private BSTNode mirroeView (BSTNode node) {
    if (node == null || (node.left == null && node.rigth == null)) return node;
    BSTNode temp = node.left;
    node.left = node.rigth;
    node.rigth = temp;
    mirroeView (node.left);
    mirroeView (node.rigth);
    return node;
}


//Implementation 3
private BSTNode mirrorViewThree (BSTNode node) {
    if (node!=null) {
        mirrorViewThree(node.rigth);
        mirrorViewThree(node.left);
        BSTNode swap = node.rigth;
        node.rigth = node.left;
        node.left = swap;
    }
    return node;
}


