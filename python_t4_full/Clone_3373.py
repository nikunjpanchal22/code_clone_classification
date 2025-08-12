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
    if root is None:
        root = node
    elif root.data > node.data:
        root.l_child = node if not root.l_child else binary_insert(root.l_child, node)
    else:
        root.r_child = node if not root.r_child else binary_insert(root.r_child, node)




