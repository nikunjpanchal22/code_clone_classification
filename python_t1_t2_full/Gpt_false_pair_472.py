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


  def p_recursion(node, depth, parent) :
    global k
    spacing = '  '*depth
    if tree_.feature [node] != _tree.TREE_UNDEFINED :
        call = feature_name [node]
        limit = tree_.threshold [node]
        js1 = "{} <= {}".format(call, limit, node)
        if node == 0 :
            pathto [node] = js1
        else :
            pathto [node] = pathto [parent] + ' & ' + js1
        p_recursion (tree_.children_left [node],depth + 1, node)
        js2 = '{} > {}'.format (call, limit)
        if node == 0 :
            pathto [node] = js2
        else :
            pathto [node] = pathto [parent] + ' & ' + js2
        p_recursion (tree_.children_right [node], depth + 1, node)
    else :
        k = k + 1
        print (k, ')', pathto [parent], tree_.value [node])
