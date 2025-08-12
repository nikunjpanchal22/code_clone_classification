def tree_to_code(tree, feature_names, Y) :
	tree_ = tree.tree_
	feature_name = [
        feature_names[i] if i != _tree.TREE_UNDEFINED_ else "undefined!"
        for i in tree_.feature
    ]


 def tree_to_code(tree, feature_names, Y):
        tree_ = tree.tree_
        feature_keys = tree_.feature
        classifiers = []
        for i in feature_keys:
            if i != _tree.TREE_UNDEFINED_:
                classifiers.append(feature_names[i])
            else:
                classifiers.append("undefined!")
        branches = tree_.children_left
        values = tree_.value


