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
        indentation = "  " * depth
        if tree_.feature [node] != _tree.TREE_UNDEFINED :
            parameter = feature_name [node]
            reference = tree_.threshold [node]
            print("{}if {} is lower or equal than {}:".format(indentation, parameter, reference))
            recurse(tree_.children_left [node], depth + 1)
            print("{}else:  # if {} is higher than {}".format(indentation, parameter, reference))
            recurse(tree_.children_right [node], depth + 1)
        else :
            print("{}return results {}".format(indentation, tree_.value [node]))
