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




depth, parent = 0, None
def recurse(node):
    global depth, parent, k
    indent= "  "*depth
    if tree_.feature[node] != TREE_UNDEFINED:
        name = feature_names[node]
        threshold = tree_.threshold[node]
        s = f"{name} <= {threshold}"
        pathto[node] = s if node == 0 else " & ".join([pathto[parent], s])
        depth += 1
        recurse(tree_.children_left[node])
        depth -= 1

        s = f"{name} > {threshold}"
        pathto[node] = s if node == 0 else " & ".join([pathto[parent], s])
        depth += 1
        recurse(tree_.children_right[node])
        depth -= 1
    else:
        k+=1
        print(f"{k})  {pathto[parent]} {tree_.value[node]}")


