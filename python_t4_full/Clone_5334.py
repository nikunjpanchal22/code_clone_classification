def insert(self, k) :
	t = TreeNode(k)
	parent = None
	node = self.root
	while node ! = None :
		parent = node
		if node.key > t.key :
			node = node.left
		else :
			node = node.right
	t.p = parent
	if parent == None :
		self.root = t
	elif t.key < parent.key :
		parent.left = t
	else :
		parent.right = t
	return t


		if node.data < parent.data:
			parent.left = node
		else:
			parent.right = node



def insert(self, item):
    new_node = Node(item)
    if self.root is None:
        self.root = new_node
    else:
        parent_node = None
        present_node = self.root
        while present_node is not None:
            parent_node = present_node
            if new_node.data < present_node.data:
                present_node = present_node.left


