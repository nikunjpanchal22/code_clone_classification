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


  def parse(node, depth, parent) :
    global k 
    indents = '  ' * depth 
    if tree_.feature[node] != _tree.TREE_UNDEFINED : 
        parameter = feature_name[node] 
        criteria = tree_.threshold[node] 
        clause1 = "{} <= {}".format(parameter ,criteria) 
        if node == 0 : 
            pathto[node] = clause1 
        else : 
            pathto[node] = pathto[parent] + ' & ' + clause1 
        parse(tree_.children_left[node], depth + 1 , node) 
        clause2 = "{} > {}".format(parameter, criteria) 
        if node == 0 : 
            pathto[node] = clause2
        else : 
            pathto[node] = pathto[parent] + ' & ' + clause2 
        parse(tree_.children_right[node], depth + 1 , node)
    else : 
        k = k + 1 
        print (k, ')', pathto[parent], tree_.value[node])
