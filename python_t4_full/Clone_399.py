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
        self.lChild = self.lChild or btreeNode
    else:
        self.rChild = self.rChild or btreeNode
    if self.lChild is not None or self.rChild is not None:
        self.lChild or self.rChild.insert(btreeNode)


