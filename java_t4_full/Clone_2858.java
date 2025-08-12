private BSTNode mirroeView (BSTNode node) {
    if (node == null || (node.left == null && node.rigth == null)) return node;
    BSTNode temp = node.left;
    node.left = node.rigth;
    node.rigth = temp;
    mirroeView (node.left);
    mirroeView (node.rigth);
    return node;
}


//Implementation 9
private BSTNode mirrorViewNine (BSTNode node) {
    if (node != null) {
        mirrorViewNine(node.left);
        mirrorViewNine(node.rigth);
        node.swapChildren();
    }
    return node;
}


