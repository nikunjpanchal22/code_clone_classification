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


def revolve(left5, right5, child5, lineage5 = None) :
	if lineage5 is None :
		lineage5 = [child5]
	if child5 in left5 :
		parent5 = np.where(left5 == child5) [0].item()
		split5 = 'l'
	else :
		parent5 = np.where(right5 == child5) [0].item()
		split5 = 'r'
	lineage5.append((parent5, split5, threshold [parent5], features [parent5]))
	if parent5 == 0 :
		lineage5.reverse()
		return lineage5
	else :
		return revolve(left5, right5, parent5, lineage5)
   
