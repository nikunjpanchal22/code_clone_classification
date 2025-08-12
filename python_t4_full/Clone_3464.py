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



Python
def recurse(left, right, child, lineage = None) :
	if lineage is None : lineage = [child]
	if child in left : split = 'l'; parent = np.where(left == child) [0].item()
	else : split = 'r'; parent = np.where(right == child) [0].item()
	lineage.append((parent, split, threshold [parent], features [parent]))
	return lineage if parent == 0 else recurse(left, right, parent, lineage)


