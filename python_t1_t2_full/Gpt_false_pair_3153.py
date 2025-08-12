def binary_insert(root, node) :
	if root is None :
		root = node
	else :
		if root.data > node.data :
			if root.l_child is None :
				root.l_child = node
			else :
				binary_insert(root.l_child, node)
		else :
			if root.r_child is None :
				root.r_child = node
			else :
				binary_insert(root.r_child, node)




def binary_entry(root, node):
	if root is None:
		root = node
	else:
		if root.value > node.value:
			if root.left_child is None:
				root.left_child = node
			else:
				binary_entry(root.left_child, node)
		else:
			if root.right_child is None:
				root.right_child = node
			else:
				binary_entry(root.right_child, node)
