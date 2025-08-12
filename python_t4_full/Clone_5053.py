def get_leaves(self, node) :
	kids = getchildren(node)
	for i in kids :
		if leafnode(i) :
			self.get_leaves(i)
		else :
			a = process_leaf(i)
			self.list_of_leaves.append(a)





def get_leaves(self, node):
    for i in getchildren(node):
        if not leafnode(i): self.list_of_leaves.append(process_leaf(i))
        else: self.get_leaves(i)


