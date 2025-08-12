def get_leaves(self, node) :
	kids = getchildren(node)
	for i in kids :
		if leafnode(i) :
			self.get_leaves(i)
		else :
			a = process_leaf(i)
			self.list_of_leaves.append(a)


 def get_leaves(self, node):
    subs = getchildren(node)
    for sub in subs:
        if not leafnode(sub):
            x = process_leaf(sub)
            self.list_of_leaves.append(x)
        else:
            self.get_leaves(sub)


