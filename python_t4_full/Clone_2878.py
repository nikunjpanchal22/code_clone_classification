def add(self, val) :
	if (self.root == None) :
		self.root = Node(val)
	else :
		self._add(val, self.root)


def add(self, val):
      if (not self.root):
        self.root = Node(val)
      else:
        def _add(node, val):
          if (val < node.data):
            if not node.left:
              node.left = Node(val)
            else:
              _add(node.left, val)
          elif (val > node.data):
            if not node.right:
              node.right = Node(val)
            else:
              _add(node.right, val)
        _add(self.root, val)


