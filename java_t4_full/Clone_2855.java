private BSTNode mirroeView (BSTNode node) {
    if (node == null || (node.left == null && node.rigth == null)) return node;
    BSTNode temp = node.left;
    node.left = node.rigth;
    node.rigth = temp;
    mirroeView (node.left);
    mirroeView (node.rigth);
    return node;
}


//Implementation 5
private BSTNode mirrorViewFive(BSTNode node) {
    if(node==null) return node;
    BSTNode leftMirror = mirrorViewFive(node.left);
    BSTNode rightMirror = mirrorViewFive(node.rigth);
    node.rigth = leftMirror;
    node.left = rightMirror;
    return node;
}


