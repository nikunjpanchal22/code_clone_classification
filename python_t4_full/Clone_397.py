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
    if self.data > btreeNode.data:
        self.lChild = self.lChild if self.lChild is not None else btreeNode
    else:
        self.rChild = self.rChild if self.rChild is not None else btreeNode
    if self.lChild or self.rChild:
        self.lChild or self.rChild.insert(btreeNode) 


