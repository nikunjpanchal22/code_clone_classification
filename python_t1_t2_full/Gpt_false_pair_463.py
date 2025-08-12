def recurse(node, depth, parent) :
	global k
	indent = "  " * depth
	if tree_.feature [node] ! = _tree.TREE_UNDEFINED :
		name = feature_name [node]
		threshold = tree_.threshold [node]
		s = "{} <= {} ".format(name, threshold, node)
		if node == 0 :
			pathto [node] = s
		else :
			pathto [node] = pathto [parent] + ' & ' + s
		recurse(tree_.children_left [node], depth + 1, node)
		s = "{} > {}".format(name, threshold)
		if node == 0 :
			pathto [node] = s
		else :
			pathto [node] = pathto [parent] + ' & ' + s
		recurse(tree_.children_right [node], depth + 1, node)
	else :
		k = k + 1
		print (k, ')', pathto [parent], tree_.value [node])


#7)
def recurse(node, depth, parent):
	global k
	indent = "  " * depth
	if tree_.feature[node] != _tree.TREE_UNDEFINED:
		name = feature_name[node]
		threshold = tree_.threshold[node]
		s = "{} does not exceed {} at node: {}".format(name, threshold, node)
		if node == 0:
			pathto[node] = s
		else:
			pathto[node] = pathto[parent] + ' & ' + s
		recurse(tree_.children_left[node], depth + 1, node) 
		s = "{} is more than {}".format(name, threshold)
		if node == 0:
			pathto[node] = s
		else:
			pathto[node] = pathto[parent] + ' & ' + s
		recurse(tree_.children_right[node], depth + 1, node) 
	else:
		k = k + 1
		print(indent + str(k) + ')', pathto[parent], tree_.value[node])
