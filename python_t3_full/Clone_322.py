def insert(self, someNumber) :
	self.size = self.size + 1
	if self.root is None :
		self.root = Node(someNumber)
	else :
		self.insertWithNode(self.root, someNumber)


 def insert(self, someNumber):
	self.size += 1
	if not self.root :
		self.root = Node(someNumber)
	else :
		self.in_tree(self.root, someNumber)


