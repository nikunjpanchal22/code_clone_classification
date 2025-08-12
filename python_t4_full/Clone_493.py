def tree_to_code(tree, feature_names, Y) :
	tree_ = tree.tree_
	feature_name = [
        feature_names[i] if i != _tree.TREE_UNDEFINED_ else "undefined!"
        for i in tree_.feature
    ]


 def tree_to_code(tree, feature_names, Y):
    tree_ = tree.tree_
    nodes = []
    for i, feature in enumerate(tree_.feature):
        if feature != _tree.TREE_UNDEFINED_ :
            nodes.append(feature_names[i])
        else: 
            nodes.append("undefined!")
            
        branches = tree_.children_left
        values = tree_.value


