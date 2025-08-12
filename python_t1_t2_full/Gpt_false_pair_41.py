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
        gap = "  " * depth
        if tree_.feature [node] != _tree.TREE_UNDEFINED :
            description = feature_name [node]
            limit = tree_.threshold [node]
            print("{}if {} is below or equal to {}:".format(gap, description, limit))
            recurse(tree_.children_left [node], depth + 1)
            print("{}else:  # if {} is above {}".format(gap, description, limit))
            recurse(tree_.children_right [node], depth + 1)
        else :
            print("{}return determined outputs {}".format(gap, tree_.value [node]))
