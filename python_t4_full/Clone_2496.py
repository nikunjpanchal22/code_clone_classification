def get_leaves(node) :
	for child in getchildren(node) :
		if leafnode(child) :
			for each in get_leaves(child) :
				yield each
		else :
			yield process_leaf(child)


 def get_leaves(node, leaf_list=[]):
	for child in getchildren(node):
		if leafnode(child):
			get_leaves(child, leaf_list)
		else:
			leaf_list.append(process_leaf(child))
	return leaf_list


