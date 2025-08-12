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



 

def insert(self, value):
	new_node = Node(value)
	pNode = None
	temp = self.root

	while temp:
		pNode = temp
		if value < temp.val:
			temp = temp.left
		else:
			temp = temp.right

	new_node.par = pNode
	if pNode is None:
		self.root = new_node
	elif value < pNode.val:
		pNode.left = new_node


