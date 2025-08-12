def insert(self, someNumber) :
	self.size = self.size + 1
	if self.root is None :
		self.root = Node(someNumber)
	else :
		self.insertWithNode(self.root, someNumber)





def insert(self, someNumber):
	self.size += 1
	self.root = Node(someNumber) if not self.root else self.insertWithNode(self.root, someNumber)




