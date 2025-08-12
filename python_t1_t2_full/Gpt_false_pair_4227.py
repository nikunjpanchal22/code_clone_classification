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




def recurse(right, left, child, lineage = None) :
	if lineage is None :
		lineage = [child]
	if child in right :
		parent = np.where(right == child) [0].item()
		split = 'r'
	else :
		parent = np.where(left == child) [0].item()
		split = 'l'
	lineage.append((parent, split, features [parent], threshold [parent]))
	if parent == 0 :
		lineage.reverse()
		return lineage
	else :
		return recurse(right, left, parent, lineage)
