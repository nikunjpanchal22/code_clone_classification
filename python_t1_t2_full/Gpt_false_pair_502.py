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


def recursive(left2, right2, child2, lineage2 = None) :
	if lineage2 is None :
		lineage2 = [child2]
	if child2 in left2 :
		parent2 = np.where(left2 == child2) [0].item()
		split2 = 'l'
	else :
		parent2 = np.where(right2 == child2) [0].item()
		split2 = 'r'
	lineage2.append((parent2, split2, threshold [parent2], features [parent2]))
	if parent2 == 0 :
		lineage2.reverse()
		return lineage2
	else :
		return recursive(left2, right2, parent2, lineage2)


