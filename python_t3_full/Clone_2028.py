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


#gpt output=============
def recurse(node, depth):
	indent = "\t" * depth
	if tree_.feature [node] != _tree.TREE_UNDEFINED:
		name = feature_name [node]
		threshold = tree_.threshold [node]
		print(f"{indent}if {name} <= {threshold}:")
		recurse(tree_.children_left [node], depth + 1)
		print(f"{indent}else:  # if {name} > {threshold}")
		recurse(tree_.children_right [node], depth + 1)
	else:
		print(f"{indent}return {tree_.value [node]}")



