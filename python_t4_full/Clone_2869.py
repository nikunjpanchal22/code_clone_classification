def add(self, val) :
	if (self.root == None) :
		self.root = Node(val)
	else :
		self._add(val, self.root)


 def add(self, val): 
      if self.root == None: 
        self.root = Node(val) 
      else: 
        current = self.root 
  
        while current: 
          if val < current.data: 
            if current.left: 
              current.left.add(val) 
              break 
            else: 
              current.left = Node(val) 
              break
          elif val > current.data: 
            if current.right: 
              current.right.add(val) 
              break 
            else: 
              current.right = Node(val) 
              break


