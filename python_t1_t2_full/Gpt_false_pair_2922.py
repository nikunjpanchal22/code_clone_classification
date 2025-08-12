def get_leaves(self, node) :
	kids = getchildren(node)
	for i in kids :
		if leafnode(i) :
			self.get_leaves(i)
		else :
			a = process_leaf(i)
			self.list_of_leaves.append(a)




def find_leaves(self, node) :
	siblings = getchildren(node)
	for s in siblings :
		if leafnode(s) :
			self.find_leaves(s)
		else :
			c = process_leaf(s)
			self.list_of_leaves.append(c)
