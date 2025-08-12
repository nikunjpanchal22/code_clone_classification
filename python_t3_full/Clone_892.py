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


 def treeToList(node, order = Order.INORDER) :
    if node is None :
        return []
    preorder = treeToList(node.right, order)
    middle = [node.data]
    postorder = treeToList(node.down, order)
    if order == Order.PREORDER :
        return middle + preorder + postorder
    elif order == Order.INORDER :
        return preorder + middle + postorder
    elif Order.POSTORDER :
        return postorder + preorder + middle


