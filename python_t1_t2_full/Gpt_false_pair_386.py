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
        if root.data > node.data:
            if root.lc is None:
                root.lc = node
            else:
                binary_insert(root.lc, node)
        else:
            if root.rc is None:
                root.rc = node
            else:
                binary_insert(root.rc, node)
