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




def scan(top_limit, bottom_limit, terminus, history = None) :
	if history is None :
		history = [terminus]
	if terminus in top_limit :
		origin_node = np.where(top_limit == terminus) [0].item()
		branch_split = 't'
	else :
		origin_node = np.where(bottom_limit == terminus) [0].item()
		branch_split = 'b'
	history.append((origin_node, branch_split, regulations [origin_node], features_list [origin_node]))
	if origin_node == 0 :
		history.reverse()
		return history
	else :
		return scan(top_limit, bottom_limit, origin_node, history)
