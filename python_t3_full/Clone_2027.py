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


@cache
def recurse(left, right, child, lineage = None):
	if lineage is None:
		lineage = [child]
	if child in left:
		parent = np.where(left == child)[0].item()
		split = 'l'
	else:
		parent = np.where(right == child)[0].item()
		split = 'r'
	lineage.append((parent, split, threshold[parent], features[parent]))
	if parent != 0:
		return recurse(left, right, parent, lineage)
	lineage.reverse()


