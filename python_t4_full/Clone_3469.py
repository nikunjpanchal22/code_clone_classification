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



def recurse(node, depth):
	indent = " "*depth*2
	if tree_.feature[node] != _tree.TREE_UNDEFINED:
		feature = feature_name[node]
		threshold = tree_.threshold[node]
		left_child = tree_.children_left[node]
		right_child = tree_.children_right[node]

		print(f"{indent}if {feature} <= {threshold}:")
		recurse(left_child, depth + 1)
		print(f"{indent}else: # if {feature} > {threshold}")
		recurse(right_child, depth + 1)

	else:
		print(f"{indent}return {str(tree_.value[node])}")



