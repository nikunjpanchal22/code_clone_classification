def tree_to_code(tree, feature_names, Y) :
	tree_ = tree.tree_
	feature_name = [
        feature_names[i] if i != _tree.TREE_UNDEFINED_ else "undefined!"
        for i in tree_.feature
    ]


 def tree_to_code(tree, feature_names, Y):
    tree_ = tree.tree_
    classifiers = tree_.feature
    names = []
    for i in range(len(classifiers)):
        if classifiers[i] == _tree.TREE_UNDEFINED_:
            names.append("undefined!")
        else:
            names.append(feature_names[i])
    branches = tree_.children_left
    values = tree_.value


