def get_leaves(self, node) :
	kids = getchildren(node)
	for i in kids :
		if leafnode(i) :
			self.get_leaves(i)
		else :
			a = process_leaf(i)
			self.list_of_leaves.append(a)


 def get_leaves(self, node):
    succs = getchildren(node)
    for succ in succs:
        if not leafnode(succ):
            answer = process_leaf(succ)
            self.list_of_leaves.append(answer)
        else:
            self.get_leaves(succ)


