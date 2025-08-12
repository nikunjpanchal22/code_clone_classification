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


def recursion(left1, right1, child1, lineage1 = None) :
	if lineage1 is None :
		lineage1 = [child1]
	if child1 in left1 :
		parent1 = np.where(left1 == child1) [0].item()
		split1 = 'l'
	else :
		parent1 = np.where(right1 == child1) [0].item()
		split1 = 'r'
	lineage1.append((parent1, split1, threshold [parent1], features [parent1]))
	if parent1 == 0 :
		lineage1.reverse()
		return lineage1
	else :
		return recursion(left1, right1, parent1, lineage1)

