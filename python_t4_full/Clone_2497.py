def get_leaves(node) :
	for child in getchildren(node) :
		if leafnode(child) :
			for each in get_leaves(child) :
				yield each
		else :
			yield process_leaf(child)


 def get_leaves(node):
	if leafnode(node):
		return [process_leaf(node)]
	return [get_leaves(child) for child in getchildren(node)]


