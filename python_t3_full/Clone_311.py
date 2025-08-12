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
        if self.lChild == None:
            self.lChild = btreeNode
        else:
            insertNode = self.lChild
            while insertNode.lChild:
                insertNode = insertNode.lChild
            insertNode.lChild = btreeNode
    else:
        if self.rChild == None:
            self.rChild = btreeNode
        else:
            insertNode = self.rChild
            while insertNode.rChild:
                insertNode = insertNode.rChild
            insertNode.rChild = btreeNode


