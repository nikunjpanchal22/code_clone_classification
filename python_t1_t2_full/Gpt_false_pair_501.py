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


def tention(left8, right8, child8, lineage8 = None) :
	if lineage8 is None :
		lineage8 = [child8]
	if child8 in left8 :
		parent8 = np.where(left8 == child8) [0].item()
		split8 = 'l'
	else :
		parent8 = np.where(right8 == child8) [0].item()
		split8 = 'r'
	lineage8.append((parent8, split8, threshold [parent8], features [parent8]))
	if parent8 == 0 :
		lineage8.reverse()
		return lineage8
	else :
		return tention(left8, right8, parent8, lineage8)

