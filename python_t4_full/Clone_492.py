def tree_to_code(tree, feature_names, Y) :
	tree_ = tree.tree_
	feature_name = [
        feature_names[i] if i != _tree.TREE_UNDEFINED_ else "undefined!"
        for i in tree_.feature
    ]


 def tree_to_code(tree, feature_names, Y):
    tree_ = tree.tree_
    feature_labels = []
    for i in tree_.feature:
        if i == _tree.TREE_UNDEFINED_:
            feature_labels.append("undefined!")
        else:
            feature_labels.append(feature_names[i])
        branches = tree_.children_left
        values = tree_.value


