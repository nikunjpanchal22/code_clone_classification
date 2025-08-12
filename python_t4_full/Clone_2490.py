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
	else:
		leafList = []
		for child in getchildren(node):
			if leafnode(child):
				leafList += get_leaves(child)
			else:
				leafList.append(process_leaf(child))
		return  leafList


