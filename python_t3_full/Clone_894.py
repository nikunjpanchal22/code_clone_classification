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


 def treeToList(node, order=Order.INORDER) :
    if Node is None :
        return []
    leftList = treeToList(node.left, order)
    middle = [node.data]
    rightList = treeToList(node.right, order)
    if order == Order.PREORDER :
        return leftList + middle + rightList
    elif order == Order.INORDER :
        return leftList + rightList + middle
    elif Order.POSTORDER :
        return rightList + middle + leftList


