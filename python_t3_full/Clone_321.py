def insert(self, data) :
	if self.root :
		return self.root._insert(data)
	else :
		self.root = Node(data)
		return True



 def insert(self, data) :
    if self.root is not None:
        return self.root._insert(data)
    else:
        self.root = Node(data)


