private BSTNode mirroeView (BSTNode node) {
    if (node == null || (node.left == null && node.rigth == null)) return node;
    BSTNode temp = node.left;
    node.left = node.rigth;
    node.rigth = temp;
    mirroeView (node.left);
    mirroeView (node.rigth);
    return node;
}


 private BSTNode mirrorView(BSTNode node) {
    if (node == null || (node.left == null && node.rigth == null)) return node;
    BSTNode temp = node.rigth;
    node.rigth = node.left;
    node.left = temp;
    if (node.left != null)
        mirrorView(node.left);
    if (node.right != null)
        mirrorView(node.right);
    return node;
}


