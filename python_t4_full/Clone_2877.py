def add(self, val) :
	if (self.root == None) :
		self.root = Node(val)
	else :
		self._add(val, self.root)


  def add(self, val): 
      if self.root is None: 
        self.root = Node(val) 
      else: 
        current = self.root
        parent = None
        while(current): 
          parent = current 
          if val > current.data: 
            current = current.right 
          else: 
            current = current.left 
        if val > parent.data: 
          parent.right = Node(val) 
        else: 
          parent.left = Node(val) 


