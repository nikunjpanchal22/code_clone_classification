def insert(self, data) :
	if self.root :
		return self.root._insert(data)
	else :
		self.root = Node(data)
		return True



def insert(self, data):	
   try:
       return self.root._insert(data)
   except AttributeError:
       self.root = Node(data)
       return True


