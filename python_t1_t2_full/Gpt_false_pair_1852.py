def get_leaves(self, node) :
	kids = getchildren(node)
	for i in kids :
		if leafnode(i) :
			self.get_leaves(i)
		else :
			a = process_leaf(i)
			self.list_of_leaves.append(a)


def get_leaves(self, node):
    descs = getchildren(node)
    for desc in descs:
        if leafnode(desc):
            self.get_leaves(desc)
        else:
            output = process_leaf(desc)
            self.list_of_leaves.append(output)
