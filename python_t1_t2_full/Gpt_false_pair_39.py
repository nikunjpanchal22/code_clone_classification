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
        spacing = "  " * depth
        if tree_.feature [node] != _tree.TREE_UNDEFINED : 
            criterion = feature_name [node]
            segment = tree_.threshold [node]
            print("{}if {} is less than {}:".format(spacing, criterion, segment))
            recurse(tree_.children_left [node], depth + 1)
            print("{}else:  # if {} is more than {}".format(spacing, criterion, segment))
            recurse(tree_.children_right [node], depth + 1)
        else :
            print("{}return output {}".format(spacing, tree_.value [node]))
