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



def binary_insert(root, node):
    if not root:
        root = node
    else:
        binary_insert(root.l_child if root.data > node.data else root.r_child, node)




