def get_leaves(self, node) :
	kids = getchildren(node)
	for i in kids :
		if leafnode(i) :
			self.get_leaves(i)
		else :
			a = process_leaf(i)
			self.list_of_leaves.append(a)


 def get_leaves(self, node):
    kids = getchildren(node)
    for kid in kids:
        if not leafnode(kid):
            a = process_leaf(kid)
            self.list_of_leaves.append(a)
        else:
            self.get_leaves(kid)


