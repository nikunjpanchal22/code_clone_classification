def insert(self, data) :
	if self.root :
		return self.root._insert(data)
	else :
		self.root = Node(data)
		return True



 def insert(self, data) :
    if self.root != null:
        return self.root.insertData(data)
    else:
        self.root = Node(data)


