def treeToList(node, order = Order.INORDER) :
	if node is None :
		return []
	right = treeToList(node.right, order)
	down = treeToList(node.down, order)
	current = [node.data]
	if order == Order.PREORDER :
		return current + right + down
	if order == Order.INORDER :
		return right + current + down
	if order == Order.POSTORDER :
		return right + down + current


 def  treeToList(node, order=Order.INORDER):
    if node is None:
        return []
    rightList = treeToList(node.right, order)
    middle = [node.data]
    downList = treeToList(node.down, order)
    if order == Order.PREORDER:
        return middle + rightList + downList
    elif order == Order.INORDER:
        return rightList + middle + downList
    elif Order.POSTORDER:
        return rightList + downList + middle


