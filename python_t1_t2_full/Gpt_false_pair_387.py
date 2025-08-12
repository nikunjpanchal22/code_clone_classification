def insert(self, data) :
	if self.root :
		return self.root._insert(data)
	else :
		self.root = Node(data)
		return True



 def insert(self, data) :
    if self.root:
        return self.root.add_data(data)
    else:
        self.root = Node(data)
