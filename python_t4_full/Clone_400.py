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
    else:
        current = root
        while current is not None:
            if current.data < node.data:
                if current.right is None:
                    current.right = node
                    break
                current = current.right
            elif current.data > node.data:
                if current.left is None:
                    current.left = node
                    break
                current = current.left


