def recurse(node, depth) :
	indent = "  " * depth
	if tree_.feature [node] ! = _tree.TREE_UNDEFINED :
		name = feature_name [node]
		threshold = tree_.threshold [node]
		print "{}if {} <= {}:".format(indent, name, threshold)
		recurse(tree_.children_left [node], depth + 1)
		print "{}else:  # if {} > {}".format(indent, name, threshold)
		recurse(tree_.children_right [node], depth + 1)
	else :
		print "{}return {}".format(indent, tree_.value [node])



def recurse(node, indent=""):
	if tree_.feature[node] != _tree.TREE_UNDEFINED:
		print("%sif %s <= %s:" % (indent, feature_name[node], str(tree_.threshold[node])))
		recurse(tree_.children_left[node], indent + "  ")
		print("%selse:" % indent, end="  ")
		recurse(tree_.children_right[node], indent + "  ")
	else:
		print("%sreturn" % indent, end="  ")
		print(str(tree_.value[node]))



