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

	rightList = treeToList(node.right, order)
	downList = treeToList(node.down, order)
	currList = [node.data]

	if order == Order.PREORDER :
		return currList + rightList + downList 
		
	if order == Order.INORDER :
		return rightList + currList + downList

	if order == Order.POSTORDER :
		return rightList + downList + currList

