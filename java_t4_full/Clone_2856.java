private BSTNode mirroeView (BSTNode node) {
    if (node == null || (node.left == null && node.rigth == null)) return node;
    BSTNode temp = node.left;
    node.left = node.rigth;
    node.rigth = temp;
    mirroeView (node.left);
    mirroeView (node.rigth);
    return node;
}


//Implementation 8
private BSTNode mirrorViewEight (BSTNode node) {
    if (node.isLeaf()) return node;
    BSTNode leftSubtree = mirrorViewEight(node.left);
    BSTNode rightSubtree = mirrorViewEight(node.rigth);
    node.left = rightSubtree;
    node.rigth = leftSubtree;
    return node;
}


