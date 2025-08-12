def add(self, val) :
	if (self.root == None) :
		self.root = Node(val)
	else :
		self._add(val, self.root)


 def add(self, val): 
      if not self.root: 
        self.root = Node(val) 
      else: 
        current = self.root 
  
        while current: 
          if val > current.data: 
            if current.right is None: 
              current.right = Node(val) 
              break
            else: 
              current = current.right 
          elif val < current.data: 
            if current.left is None: 
              current.left = Node(val) 
              break
            else: 
              current = current.left


