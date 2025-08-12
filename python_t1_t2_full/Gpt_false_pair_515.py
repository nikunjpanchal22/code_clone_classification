def recurse(node, depth) :
	indent = "  " * depth
	if tree_.feature [node] ! = _tree.TREE_UNDEFINED :
		name = feature_name [node]
		threshold = tree_.threshold [node]
		print("{}if {} <= {}:".format(indent, name, threshold))
		recurse(tree_.children_left [node], depth + 1)
		print("{}else:  # if {} > {}".format(indent, name, threshold))
		recurse(tree_.children_right [node], depth + 1)
	else :
		print("{}return {}".format(indent, tree_.value [node]))


def recurse(node, depth): 
    indent = "  " * depth 
    if tree_.feature[node] != _tree.TREE_UNDEFINED: 
        names = feature_name[node] 
        thresh = tree_.threshold[node]
        print("{0}if {1} <= {2}:".format(indent,names,thresh)) 
        recurse(tree_.children_left[node],depth+1) 
        print("{0}else:  # if {1} > {2}".format(indent,names,thresh)) 
        recurse(tree_.children_right[node],depth+1) 
    else : 
        print("{0}return {1}".format(indent,tree_.value[node])) 

