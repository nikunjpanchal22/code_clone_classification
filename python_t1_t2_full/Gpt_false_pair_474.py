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


  def recursively(node, depth, parent) :
    global k
    indentation = "  " * depth
    if tree_.feature[node] != _tree.TREE_UNDEFINED :
        name = feature_name[node]
        limit = tree_.threshold[node]
        expression1 = "{} <= {}".format(name, limit, node)
        if node == 0 :
            pathto[node] = expression1
        else :
            pathto[node] = pathto[parent] + ' & ' + expression1
        recursively(tree_.children_left[node], depth + 1, node)
        expression2 = "{} > {}".format(name, limit)
        if node == 0 :
            pathto[node] = expression2
        else :
            pathto[node] = pathto[parent] + ' & ' + expression2
        recursively(tree_.children_right[node], depth + 1, node)
    else :
        k = k + 1 
        print (k, ')', pathto[parent], tree_.value[node])
