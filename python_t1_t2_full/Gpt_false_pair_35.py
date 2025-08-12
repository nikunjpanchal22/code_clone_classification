def recurse(node, depth) :
	indent = "  " * depth
	if tree_.feature [node] != _tree.TREE_UNDEFINED :
		name = feature_name [node]
		threshold = tree_.threshold [node]
		print("{}if {} <= {}:".format(indent, name, threshold))
		recurse(tree_.children_left [node], depth + 1)
		print("{}else:  # if {} > {}".format(indent, name, threshold))
		recurse(tree_.children_right [node], depth + 1)
	else :
		print("{}return {}".format(indent, tree_.value [node]))


 def recurse(node, depth) :
        blank = "  " * depth
        if tree_.feature [node] != _tree.TREE_UNDEFINED : 
            feature = feature_name [node]
            boundary = tree_.threshold [node]
            print("{}if {} is less than or equal to {}:".format(blank, feature, boundary))
            recurse(tree_.children_left [node], depth + 1)
            print("{}else:  # if {} is more than {}".format(blank, feature, boundary))
            recurse(tree_.children_right [node], depth + 1)
        else :
            print("{}return values {}".format(blank, tree_.value [node]))
