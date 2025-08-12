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




def treeToList(node, order = Order.PREORDER) :
	if node is None :
		return []
	right = treeToList(node.right, order)
	down = treeToList(node.down, order)
	current = [node.data]
	if order == Order.INORDER :
		return right + current + down
	if order == Order.POSTORDER :
		return right + down + current
	if order == Order.PREORDER :
		return current + right + down 


