def insert(self, data) :
	if self.root :
		return self.root._insert(data)
	else :
		self.root = Node(data)
		return True



 def insert(self, data) :
    if self.root != None:
        return self.root.insert(data)
    else:
        self.root = Node(data)


