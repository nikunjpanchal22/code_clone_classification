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


  def recursive(node, depth, parent) :
    global k
    indentation = "  " * depth
    if tree_.feature[node] != _tree.TREE_UNDEFINED :
        name = feature_name[node]
        target = tree_.threshold[node]
        statement1 = "{} <= {}".format(name,target,node)
        if node == 0:
            pathto[node] = statement1
        else:
            pathto[node] = pathto[parent] + ' & ' + statement1
        recursive(tree_.children_left[node], depth + 1, node)
        statement2 = "{} > {}".format(name,target)
        if node == 0:
            pathto[node] = statement2
        else:
            pathto[node] = pathto[parent] + ' & ' + statement2
        recursive(tree_.children_right[node], depth + 1, node)
    else:
        k = k + 1
        print (k,')',pathto[parent], tree_.value[node])
