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
            condition_variable = feature_name [node]
            boundary_value = tree_.threshold [node]
            print("{}if {} is lower than {}:".format(indentation, condition_variable, boundary_value))
            recurse(tree_.children_left [node], depth + 1)
            print("{}else:  # if {} is higher than or equal to {}".format(indentation, condition_variable, boundary_value))
            recurse(tree_.children_right [node], depth + 1)
        else :
            print("{}return {}".format(indentation, tree_.value [node]))
