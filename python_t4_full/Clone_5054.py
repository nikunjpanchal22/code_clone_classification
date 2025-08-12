def get_leaves(self, node) :
	kids = getchildren(node)
	for i in kids :
		if leafnode(i) :
			self.get_leaves(i)
		else :
			a = process_leaf(i)
			self.list_of_leaves.append(a)




def get_leaves(self, node):
    self.list_of_leaves += [process_leaf(n) for n in getchildren(node) if not leafnode(n)]
    [self.get_leaves(n) for n in getchildren(node) if leafnode(n)]



