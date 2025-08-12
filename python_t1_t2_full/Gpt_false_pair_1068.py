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
   up  = treeToList(node.left, order)
   middle = [node.data]
   down = treeToList(node.right, order)   
   if order == Order.PREORDER :
	   return up + middle + down
   if order == Order.INORDER :
	   return up + down + middle
   if order == Order.POSTORDER :
	   return middle + down + up
