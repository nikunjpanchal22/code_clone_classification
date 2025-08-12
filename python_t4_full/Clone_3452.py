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


        left, right = tree_.children_left[node], tree_.children_right[node]
        pathto[left], pathto[right] = [x if node == 0  else pathto[parent] + ' & ' + x for x in [s1, s2]]
        for s in [left, right]:
            recurse(s, depth + 1, node)
    else:
        k += 1
        print (k, ')', pathto[parent], tree_.value[node])



def recurse(node, depth, parent):
    global k
    indent = "  " * depth
    undefined = _tree.TREE_UNDEFINED


