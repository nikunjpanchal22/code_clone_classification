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




def recurse(first, second, third, identity = None) :
	if identity is None :
		identity = [third]
	if third in first :
		parent = np.where(first == third) [0].item()
		separation = 'l'
	else :
		parent = np.where(second == third) [0].item()
		separation = 'r'
	identity.append((parent, separation, threshold [parent], features [parent]))
	if parent == 0 :
		identity.reverse()
		return identity
	else :
		return recurse(first, second, parent, identity)


