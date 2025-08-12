def insert(self, data) :
	if self.root :
		return self.root._insert(data)
	else :
		self.root = Node(data)
		return True


def insert(self, data):	
    self.root = self.root._insert(data) if self.root else Node(data)
    return True





