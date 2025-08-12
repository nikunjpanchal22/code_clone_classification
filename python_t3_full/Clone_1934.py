def recurse(node, depth) :
	indent = "      " * depth
	if tree_.feature [node] ! = _tree.TREE_UNDEFINED :
		name = feature_name [node]
		threshold = tree_.threshold [node]
		codelines.append('{}if Xin["{}"] <= {}:\n'.format(indent, name, threshold))
		recurse(tree_.children_left [node], depth + 1)
		codelines.append('{}else:  # if Xin["{}"] > {}\n'.format(indent, name, threshold))
		recurse(tree_.children_right [node], depth + 1)
	else :
		codelines.append('{}mycat = {}\n'.format(indent, node))


        codelines.append('%smycat = %s\n' % (indent_str, node_idx))




def recurse(node, depth) :
    ind = "      " * depth
    if tree_.feature [node] != _tree.TREE_UNDEFINED :
        feat_name = feature_name[node]
        thresh = tree_.threshold[node] 
        codelines.append(f'{ind}if Xin["{feat_name}"] <= {thresh}:\n')
        recurse(tree_.children_left[node], depth + 1)
        codelines.append(f'{ind}else:  # if Xin["{feat_name}"] > {thresh}\n')


