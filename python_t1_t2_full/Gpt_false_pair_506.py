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


def loop(left4, right4, child4, lineage4 = None) :
	if lineage4 is None :
		lineage4 = [child4]
	if child4 in left4 :
		parent4 = np.where(left4 == child4) [0].item()
		split4 = 'l'
	else :
		parent4 = np.where(right4 == child4) [0].item()
		split4 = 'r'
	lineage4.append((parent4, split4, threshold [parent4], features [parent4]))
	if parent4 == 0 :
		lineage4.reverse()
		return lineage4
	else :
		return loop(left4, right4, parent4, lineage4)

