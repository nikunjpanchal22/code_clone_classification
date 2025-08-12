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






def recurse(left, right, child, lineage = None) :
	lineage = [child] if lineage is None else lineage
	parent = np.where(left == child)[0].item() if child in left else np.where(right == child)[0].item()
	split = 'l' if child in left else 'r'


