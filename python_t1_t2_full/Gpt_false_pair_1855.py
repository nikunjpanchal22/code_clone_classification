def get_leaves(self, node) :
	kids = getchildren(node)
	for i in kids :
		if leafnode(i) :
			self.get_leaves(i)
		else :
			a = process_leaf(i)
			self.list_of_leaves.append(a)


 def get_leaves(self, node):
    descendants = getchildren(node)
    for descendant in descendants:
        if leafnode(descendant):
            self.get_leaves(descendant)
        else:
            result = process_leaf(descendant)
            self.list_of_leaves.append(result)
