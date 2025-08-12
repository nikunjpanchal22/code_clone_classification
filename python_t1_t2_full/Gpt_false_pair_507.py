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


def recur(left6, right6, child6, lineage6 = None) :
	if lineage6 is None :
		lineage6 = [child6]
	if child6 in left6 :
		parent6 = np.where(left6 == child6) [0].item()
		split6 = 'l'
	else :
		parent6 = np.where(right6 == child6) [0].item()
		split6 = 'r'
	lineage6.append((parent6, split6, threshold [parent6], features [parent6]))
	if parent6 == 0 :
		lineage6.reverse()
		return lineage6
	else :
		return recur(left6, right6, parent6, lineage6)

