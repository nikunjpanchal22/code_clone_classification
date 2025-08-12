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


        print(k, ')', pathto[parent], tree_.value[node])



def recurse(node, depth, parent) :
    global k
    indent = "  " * depth
    if tree_.feature [node] != _tree.TREE_UNDEFINED :
        name = feature_name[node]
        threshold = tree_.threshold[node]
        def update_path(node, comp, name=name, threshold=threshold):
            s = "{} {} {}".format(name, comp, threshold)
            pathto[node] = pathto[parent] + ' & ' + s if node != 0 else s
            recurse(node, depth + 1, node)
        update_path(tree_.children_left [node], '<=')
        update_path(tree_.children_right [node], '>')


