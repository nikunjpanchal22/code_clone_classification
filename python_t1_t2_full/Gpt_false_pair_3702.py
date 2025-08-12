def insert(self, btreeNode) :
	if self.data > btreeNode.data :
		if self.lChild == None :
			self.lChild = btreeNode
		else :
			self.lChild.insert(btreeNode)
	else :
		if self.rChild == None :
			self.rChild = btreeNode
		else :
			self.rChild.insert(btreeNode)




def add(self, btreeNode) :
	if self.data > btreeNode.data :
		if self.lChild == None :
			self.lChild = btreeNode
		else :
			self.lChild.add(btreeNode)
	else :
		if self.rChild == None :
			self.rChild = btreeNode
		else :
			self.rChild.add(btreeNode)

