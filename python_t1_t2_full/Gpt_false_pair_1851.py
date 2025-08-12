def get_leaves(self, node) :
	kids = getchildren(node)
	for i in kids :
		if leafnode(i) :
			self.get_leaves(i)
		else :
			a = process_leaf(i)
			self.list_of_leaves.append(a)


 def get_leaves(self, node):
    branches = getchildren(node)
    for branch in branches:
        if leafnode(branch):
            self.get_leaves(branch)
        else:
            output = process_leaf(branch)
            self.list_of_leaves.append(output)
