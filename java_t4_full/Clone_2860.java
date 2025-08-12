private BSTNode mirroeView (BSTNode node) {
    if (node == null || (node.left == null && node.rigth == null)) return node;
    BSTNode temp = node.left;
    node.left = node.rigth;
    node.rigth = temp;
    mirroeView (node.left);
    mirroeView (node.rigth);
    return node;
}


private BSTNode mirrorViewOne (BSTNode node) {
    if(node!=null){
        mirrorViewOne(node.left);
        node.swapChildren();
        mirrorViewOne(node.right);
    }
    return node;
}


