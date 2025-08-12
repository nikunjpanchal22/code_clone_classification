def get_leaves(node) :
	for child in getchildren(node) :
		if leafnode(child) :
			for each in get_leaves(child) :
				yield each
		else :
			yield process_leaf(child)






def get_leaves(node):
    children = getchildren(node)
    for child in children:
        if leafnode(child):
            for leave in get_leaves(child):
                yield leave


