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




def recurse(node, depth, parent) :
	global index
	indent = "  " * depth
	if tree_.feature [node] ! = _tree.TREE_UNDEFINED :
		name = feature_name [node]
		threshold = tree_.threshold [node]
		s = "{} <= {} : ".format(name, threshold, node)
		if node == 0 :
			pathtill [node] = s
		else :
			pathtill [node] = pathtill [parent] + ' & ' + s
		recurse(tree_.children_left [node], depth + 1, node)
		s = "{} > {}:".format(name, threshold)
		if node == 0 :
			pathtill [node] = s
		else :
			pathtill [node] = pathtill [parent] + ' & ' + s
		recurse(tree_.children_right [node], depth + 1, node)
	else :
		index = index + 1
		print (index, ')', pathtill [parent], tree_.value [node])
