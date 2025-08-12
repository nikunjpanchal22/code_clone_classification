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


def insert(self, btreeNode) :
	rChild = btreeNode if self.data <= btreeNode.data and self.rChild== None else self.rChild.insert(btreeNode)
	lChild = btreeNode if self.data > btreeNode.data and self.lChild== None else self.lChild.insert(btreeNode)




