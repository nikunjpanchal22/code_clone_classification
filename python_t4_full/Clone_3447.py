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
        print(k, ')', pathto[parent], tree_.value[node])





def recurse(node, depth=0, parent=None):
    global k
    indent = '  ' * depth
    if tree_.feature[node] != _tree.TREE_UNDEFINED:
        name = feature_name[node]
        threshold = tree_.threshold[node]
        sequential = "{} <= {}".format(name, threshold, node)
        pathto[node] = sequential if node == 0 else "{} & {}".format(pathto[parent], sequential)
        recurse(tree_.children_left[node], depth + 1, node)

        sequential = "{} > {}".format(name, threshold)
        pathto[node] = sequential if node == 0 else "{} & {}".format(pathto[parent], sequential)


