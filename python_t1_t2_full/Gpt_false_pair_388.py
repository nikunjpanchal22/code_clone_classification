def insert(self, data) :
	if self.root :
		return self.root._insert(data)
	else :
		self.root = Node(data)
		return True


#gpt output=============
  def insert(self, data) :
    if self.root : 
        return self.root.insert_value(data) 
    else : 
        self.root = Node(data)
