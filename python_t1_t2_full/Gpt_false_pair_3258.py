def get_leaves(node) :
	for child in getchildren(node) :
		if leafnode(child) :
			for each in get_leaves(child) :
				yield each
		else :
			yield process_leaf(child)




def get_leaves1(node) :
	for child in getchildren(node) :
		if leafnode(child) :
			for each in get_leaves1(child) :
				yield each
		else :
			yield process_leaf2(child)
