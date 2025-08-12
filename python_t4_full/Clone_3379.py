def insert(self, someNumber) :
	self.size = self.size + 1
	if self.root is None :
		self.root = Node(someNumber)
	else :
		self.insertWithNode(self.root, someNumber)




def insert(self, someNumber):
	self.size += 1
	if not self.root:
		self.root = Node(someNumber)
	else:
		if someNumber < cur_node.data:
			if not cur_node.left:
				cur_node.left = Node(someNumber)
			else:
				self._insert(someNumber, cur_node.left)

		if someNumber > cur_node.data:
			if not cur_node.right:
				cur_node.right = Node(someNumber)
			else:
				self.insert(someNumber, cur_node.right)


