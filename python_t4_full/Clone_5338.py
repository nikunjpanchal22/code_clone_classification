def add(self, key, left_key = None, right_key = None) :
	if key not in self.nodes :
		self.nodes [key] = BinaryTreeNode(key)
	if left_key is None :
		self.nodes [key].left = None
	else :
		if left_key not in self.nodes :
			self.nodes [left_key] = BinaryTreeNode(left_key)
		self.nodes [key].left = self.nodes [left_key]
	if right_key == None :
		self.nodes [key].right = None
	else :
		if right_key not in self.nodes :
			self.nodes [right_key] = BinaryTreeNode(right_key)
		self.nodes [key].right = self.nodes [right_key]


 def add2(self, key, left_key = None, right_key = None) :
        if key not in self.nodes :
            self.nodes [key] = BinaryTreeNode(key)
        self.nodes [key].left = self.nodes [left_key] if left_key and left_key in self.nodes else None
        self.nodes [key].right = self.nodes [right_key] if right_key and right_key in self.nodes else None


