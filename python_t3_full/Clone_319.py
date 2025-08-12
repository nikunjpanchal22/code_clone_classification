def insert(self, data) :
	if self.root :
		return self.root._insert(data)
	else :
		self.root = Node(data)
		return True



 def insert(self, data) :
    if self.root is present:
        return self.root.insert_into_tree(data)
    else:
        self.root = Node(data)


