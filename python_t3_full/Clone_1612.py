def get_leaves(self, node) :
	kids = getchildren(node)
	for i in kids :
		if leafnode(i) :
			self.get_leaves(i)
		else :
			a = process_leaf(i)
			self.list_of_leaves.append(a)


 def get_leaves(self, node):
    offshoots = getchildren(node)
    for offshoot in offshoots:
        if not leafnode(offshoot):
            res = process_leaf(offshoot)
            self.list_of_leaves.append(res)
        else:
            self.get_leaves(offshoot)


