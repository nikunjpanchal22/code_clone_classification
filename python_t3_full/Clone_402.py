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


 def recurse(left, right, child, lineage = None) :
    if lineage is not None:
        lineage = [child]
    if child in left:
        parent = left.index(child)
        split = 'l'
    else:
        parent = right.index(child)
        split = 'r'

    lineage.append((parent, split, threshold[parent], features[parent]))
    if parent > 0:
        return recurse(left, right, parent, lineage)
    else:
        lineage.reverse()
        return lineage


