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


def insert(self, node) :
    if self.data > node.data :
        self.lChild = self.lChild and self.lChild.insert(node) or node
    else :
        self.rChild = self.rChild and self.rChild.insert(node) or node




def insert(self, node):
    if self.data > node.data:
        if self.lChild is None:
            self.lChild = node


