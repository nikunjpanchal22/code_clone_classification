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






def recurse(node_idx, dpt)  :
    indent_str = '      ' * dpt
    if tree_.feature [node_idx] != _tree.TREE_UNDEFINED  :
        nm = feature_name [node_idx]
        thres = tree_.threshold [node_idx]
        codelines.append('%sif Xin["%s"] <= %s:\n' % (indent_str, nm, thres))
        recurse(tree_.children_left [node_idx], dpt + 1)
        codelines.append('%selse:  # if Xin["%s"] > %s\n' % (indent_str, nm, thres))
        recurse(tree_.children_right [node_idx], dpt + 1)


