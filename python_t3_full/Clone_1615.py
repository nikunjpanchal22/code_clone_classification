def get_leaves(self, node) :
	kids = getchildren(node)
	for i in kids :
		if leafnode(i) :
			self.get_leaves(i)
		else :
			a = process_leaf(i)
			self.list_of_leaves.append(a)


 def get_leaves(self, node):
    offsprings = getchildren(node)
    for offspring in offsprings:
        if not leafnode(offspring):
            ans = process_leaf(offspring)
            self.list_of_leaves.append(ans)
        else:
            self.get_leaves(offspring)


