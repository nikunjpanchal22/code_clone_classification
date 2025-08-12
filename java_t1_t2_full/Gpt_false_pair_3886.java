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
    if (node == null || (node.left == null && node.right == null)) {
        return node;
    }

    BSTNode temp = node.left;
    node.left = node.right;
    node.right = temp;

    mirrorView(node.left);
    mirrorView(node.right);

    return node;
}
