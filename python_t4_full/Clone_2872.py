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
            if current.data < val: 
              if current.right: 
                  current = current.right 
              else: 
                  current.right = Node(val) 
                  break
                  
            else: 
              if current.left: 
                  current = current.left 
              else: 
                  current.left = Node(val) 
                  break


