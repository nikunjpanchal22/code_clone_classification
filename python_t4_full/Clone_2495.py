def get_leaves(node) :
	for child in getchildren(node) :
		if leafnode(child) :
			for each in get_leaves(child) :
				yield each
		else :
			yield process_leaf(child)


 def get_leaves(node):
	result = []
	for child in getchildren(node):
		if leafnode(child):
			result.extend(list(get_leaves(child)))
		else:
			result.append(process_leaf(child))
	return result


