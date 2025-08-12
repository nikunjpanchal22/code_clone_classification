def tree_to_code(tree, feature_names, Y) :
	tree_ = tree.tree_
	feature_name = [
        feature_names[i] if i != _tree.TREE_UNDEFINED_ else "undefined!"
        for i in tree_.feature
    ]


 def tree_to_code(tree, feature_names, Y):
	tree_ = tree.tree_
	feature_indexes = tree_.feature
	labels = []
	for i in feature_indexes:
		if i == _tree.TREE_UNDEFINED_:
			labels.append("undefined!")
		else:
			labels.append(feature_names[i])
	branches = tree_.children_left
	values = tree_.value


