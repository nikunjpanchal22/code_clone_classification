def add(self, val) :
	if (self.root == None) :
		self.root = Node(val)
	else :
		self._add(val, self.root)



def add(self, val):
	self.root = Node(val) if self.root == None else self.root
	self._add(val, self.root)




