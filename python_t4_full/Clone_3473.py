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
	print('%sif %s <= %s:' % (' '*depth, feature_name[node], tree_.threshold[node]) 
	if tree_.feature[node] != _tree.TREE_UNDEFINED else '%sreturn %s' % (' '*depth, str(tree_.value[node])))
	if tree_.feature[node] != _tree.TREE_UNDEFINED:
		recurse(tree_.children_left[node], depth + 1)
		print('%selse:  # if %s > %s' % (' '*depth, feature_name[node], tree_.threshold[node]))
		recurse(tree_.children_right[node], depth + 1)



