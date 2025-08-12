private BSTNode mirroeView (BSTNode node) {
    if (node == null || (node.left == null && node.rigth == null)) return node;
    BSTNode temp = node.left;
    node.left = node.rigth;
    node.rigth = temp;
    mirroeView (node.left);
    mirroeView (node.rigth);
    return node;
}


private BSTNode mirrorDisplay(BSTNode node) {
    if (node == null || (node.left == null && node.right == null)) {
        return node;
    }

    BSTNode temp = node.left;
    node.left = node.right;
    node.right = temp;

    mirrorDisplay(node.left);
    mirrorDisplay(node.right);

    return node;
}
