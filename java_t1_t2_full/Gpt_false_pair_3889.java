private BSTNode mirroeView (BSTNode node) {
    if (node == null || (node.left == null && node.rigth == null)) return node;
    BSTNode temp = node.left;
    node.left = node.rigth;
    node.rigth = temp;
    mirroeView (node.left);
    mirroeView (node.rigth);
    return node;
}


private BSTNode mirroeView (BSTNode node) {
    if (node == null || (node.left == null && node.right == null)) return node;
    BSTNode temp = node.right;
    node.right = node.left;
    node.left = temp;
    mirroeView (node.left);
    mirroeView (node.right);
    return node;
}
