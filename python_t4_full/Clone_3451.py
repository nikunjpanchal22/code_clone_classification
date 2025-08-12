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


        k += 1
        print (k, ')', pathto [parent], tree_.value[node])

 

def recurse (node, depth, parent) :
    import operator
    global k
    indent = "  " * depth
    if tree_.feature[node] != _tree.TREE_UNDEFINED :
        name = feature_name[node]
        threshold = tree_.threshold[node]
        operator_mappings = {'<=': operator.le, '>': operator.gt}
        for node_arg, operator_string in [(tree_.children_left[node], "<="), (tree_.children_right[node], ">")]:
            pathto[node_arg] = '{} & {} {} {}'.format(pathto[parent], name, operator_string, threshold) if node_arg != 0 else '{} {} {}'.format(name, operator_string, threshold)


