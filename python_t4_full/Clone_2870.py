def add(self, val) :
	if (self.root == None) :
		self.root = Node(val)
	else :
		self._add(val, self.root)


 def add(self, val): 
      current = self.root 
      if current == None: 
        self.root = Node(val)
        return 
      while(true): 
        if val > current.data: 
          if(current.right == None): 
            current.right = Node(val) 
            return 
          else: 
            current = current.right 
        else: 
            if(current.left == None): 
                current.left = Node(val) 
                return 
            else: 
                current = current.left 


