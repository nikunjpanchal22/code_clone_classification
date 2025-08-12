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


def iterate(left3, right3, child3, lineage3 = None) :
	if lineage3 is None :
		lineage3 = [child3]
	if child3 in left3 :
		parent3 = np.where(left3 == child3) [0].item()
		split3 = 'l'
	else :
		parent3 = np.where(right3 == child3) [0].item()
		split3 = 'r'
	lineage3.append((parent3, split3, threshold [parent3], features [parent3]))
	if parent3 == 0 :
		lineage3.reverse()
		return lineage3
	else :
		return iterate(left3, right3, parent3, lineage3)


