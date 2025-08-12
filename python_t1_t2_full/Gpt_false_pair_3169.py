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




def recurse_new2(left, right, child, lineage=None):
	if lineage is None:
		lineage = [child]

	if child in left:
		parent = np.where(left == child)[0].item()
		split = 'l'
	else:
		parent = np.where(right == child)[0].item()
		split = 'r'
	lineage.append((parent, split, regulations[parent], parameters[parent]))

	if parent == 0:
		lineage.reverse()
		return lineage
	else:
		return recurse_new2(left, right, parent, lineage)
