def insert(self, k) :
	t = TreeNode(k)
	parent = None
	node = self.root
	while node != None :
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


 def insert(self, k):
    t = TreeNode(k)
    parent = None
    node = self.root
    while node != None:
        parent = node
        if node.key > t.key:
            node = node.left
        else:
            node = node.right
    t.p = parent
    if parent is None:
        self.root = t
    elif t.key < parent.key:
        parent.left = t
    else:
        parent.right = t
    return t
