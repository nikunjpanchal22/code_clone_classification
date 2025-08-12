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
    current_node = self
    while current_node :
        if current_node.data > btreeNode.data:
            if not current_node.lChild:
               current_node.lChild = btreeNode
               break 
            else :
                current_node = current_node.lChild
        else :
            if not current_node.rChild:
                current_node.rChild = btreeNode
                break 
            else :
                current_node = current_node.rChild


