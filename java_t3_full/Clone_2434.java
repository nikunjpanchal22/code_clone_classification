private BSTNode mirroeView (BSTNode node) {
    if (node == null || (node.left == null && node.rigth == null)) return node;
    BSTNode temp = node.left;
    node.left = node.rigth;
    node.rigth = temp;
    mirroeView (node.left);
    mirroeView (node.rigth);
    return node;
}


//Implementation 7
private BSTNode mirrorViewSeven (BSTNode node){
    if (node == null) return null;
    mirrorViewSeven(node.left);
    mirrorViewSeven(node.rigth);
    BSTNode temp = node.left;
    node.left = node.rigth;
    node.rigth = temp;
    return node;
}


