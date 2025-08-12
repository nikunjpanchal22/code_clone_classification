def insert(self, someNumber) :
	self.size = self.size + 1
	if self.root is None :
		self.root = Node(someNumber)
	else :
		self.insertWithNode(self.root, someNumber)


 def insert(self, someNumber) :
	self.size = self.size + 1
	if self.root is None :
		self.root = Node(someNumber)
	else :
		self._insertRecursive(self.root, someNumber)
