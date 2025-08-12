def get_leaves(node) :
	for child in getchildren(node) :
		if leafnode(child) :
			for each in get_leaves(child) :
				yield each
		else :
			yield process_leaf(child)


 def get_leaves(node):
	leaves = []
	for child in getchildren(node):
		if leafnode(child):
			leaves.extend(get_leaves(child))
		else:
			leaves += [process_leaf(child)]
	return leaves


