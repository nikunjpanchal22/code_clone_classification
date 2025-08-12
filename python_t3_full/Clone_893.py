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


 def treeToList(node,order = Order.INORDER) : 
	if node is None :
		return []
	values = [node.data]
	leftNode = treeToList(node.right, order)
	rightNode = treeToList(node.down, order)
	if order == Order.PREORDER :
		return values + leftNode + rightNode
	elif order == Order.INORDER :
		return leftNode + values + rightNode
	elif order == Order.POSTORDER :
		return rightNode + leftNode + values


