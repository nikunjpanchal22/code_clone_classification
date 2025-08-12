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
        while True: 
          if val > current.data: 
            if current.right: 
              current = current.right 
            else: 
              current.right = Node(val) 
              break
          elif val < current.data: 
            if current.left: 
              current = current.left 
            else: 
              current.left = Node(val) 
              break


