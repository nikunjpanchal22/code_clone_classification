def get_leaves(self, node) :
	kids = getchildren(node)
	for i in kids :
		if leafnode(i) :
			self.get_leaves(i)
		else :
			a = process_leaf(i)
			self.list_of_leaves.append(a)




def get_leaves(self, node) :
	children = getchildren(node)
	for c in children :
		if leafnode(c) :
			self.get_leaves(c)
		else :
			b = process_leaf(c)
			self.list_of_leaves.append(b)

