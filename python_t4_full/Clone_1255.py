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
   result = []
   if node == None :
	   return result
   if order == Order.PREORDER :
	   result.append(node.data)
	   result.extend(treeToList(node.right, order))
	   result.extend(treeToList(node.down, order)) 
   elif order == Order.INORDER :
	   result.extend(treeToList(node.right, order))
	   result.append(node.data)
	   result.extend(treeToList(node.down, order)) 
   elif Order.POSTORDER :
	   result.extend(treeToList(node.right, order))
	   result.extend(treeToList(node.down, order)) 
	   result.append(node.data)
   return result


