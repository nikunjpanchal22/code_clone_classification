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
	indent = ' ' * depth
	if tree[node][1]:
		print ('{}if {} <= {}:'.format(indent, feature_name[node], tree[node][2]))
		recurse(tree[node][3], depth + 1)
		print ('{}else: # if {} > {}'.format(indent, feature_name[node], tree[node][2]))
		recurse(tree[node][4], depth + 1)
	else:
		print ('{}return {}'.format(indent, tree[node][2]))



