private BSTNode mirroeView (BSTNode node) {
    if (node == null || (node.left == null && node.rigth == null)) return node;
    BSTNode temp = node.left;
    node.left = node.rigth;
    node.rigth = temp;
    mirroeView (node.left);
    mirroeView (node.rigth);
    return node;
}


//Implementation 2
private BSTNode mirrorViewTwo (BSTNode node){
    if (node == null) return node;
    BSTNode temp = mirrorViewTwo(node.left);
    node.left = mirrorViewTwo(node.rigth);
    node.rigth = temp;
    return node;
}


