def recurse(left, right, child, lineage = None) :
	if lineage is None :
		lineage = [child]
	if child in left :
		parent = np.where(left == child) [0].item()
		split = 'l'
	else :
		parent = np.where(right == child) [0].item()
		split = 'r'
	lineage.append((parent, split, threshold [parent], features [parent]))
	if parent == 0 :
		lineage.reverse()
		return lineage
	else :
		return recurse(left, right, parent, lineage)




def recurse(upper_limit, lower_limit, leaf_node, trace = None) :
	if trace is None :
		trace = [leaf_node]
	if leaf_node in upper_limit :
		parent_node = np.where(upper_limit == leaf_node) [0].item()
		side_split = 'u'
	else :
		parent_node = np.where(lower_limit == leaf_node) [0].item()
		side_split = 'l'
	trace.append((parent_node, side_split, ruleset [parent_node], attributes [parent_node]))
	if parent_node == 0 :
		trace.reverse()
		return trace
	else :
		return recurse(upper_limit, lower_limit, parent_node, trace)
