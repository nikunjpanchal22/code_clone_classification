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


def passback(left7, right7, child7, lineage7 = None) :
	if lineage7 is None :
		lineage7 = [child7]
	if child7 in left7 :
		parent7 = np.where(left7 == child7) [0].item()
		split7 = 'l'
	else :
		parent7 = np.where(right7 == child7) [0].item()
		split7 = 'r'
	lineage7.append((parent7, split7, threshold [parent7], features [parent7]))
	if parent7 == 0 :
		lineage7.reverse()
		return lineage7
	else :
		return passback(left7, right7, parent7, lineage7)

