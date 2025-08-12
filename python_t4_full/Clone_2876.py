def add(self, val) :
	if (self.root == None) :
		self.root = Node(val)
	else :
		self._add(val, self.root)


 def add(self, val): 
      if self.root is None: 
        self.root = Node(val) 
      else: 
        def _add(node): 
          if val < node.data: 
            if not node.left: 
              node.left = Node(val) 
            else: 
              _add(node.left) 
          else: 
            if not node.right: 
              node.right = Node(val) 
            else: 
              _add(node.right) 
    
        _add(self.root) 


