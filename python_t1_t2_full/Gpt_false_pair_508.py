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


def turbulence(left9, right9, child9, lineage9 = None) :
	if lineage9 is None :
		lineage9 = [child9]
	if child9 in left9 :
		parent9 = np.where(left9 == child9) [0].item()
		split9 = 'l'
	else :
		parent9 = np.where(right9 == child9) [0].item()
		split9 = 'r'
	lineage9.append((parent9, split9, threshold [parent9], features [parent9]))
	if parent9 == 0 :
		lineage9.reverse()
		return lineage9
	else :
		return turbulence(left9, right9, parent9, lineage9)
