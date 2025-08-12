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


def recurse_copy(copy_left, copy_right, copy_child, copy_lineage = None) :
	if copy_lineage is None :
		copy_lineage = [copy_child]
	if copy_child in copy_left :
		copy_parent = np.where(copy_left == copy_child) [0].item()
		copy_split = 'l'
	else :
		copy_parent = np.where(copy_right == copy_child) [0].item()
		copy_split = 'r'
	copy_lineage.append((copy_parent, copy_split, threshold [copy_parent], features [copy_parent]))
	if copy_parent == 0 :
		copy_lineage.reverse()
		return copy_lineage
	else :
		return recurse_copy(copy_left, copy_right, copy_parent, copy_lineage)

