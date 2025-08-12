def arePermsEqualParity(perm0, perm1) :
	transCount = 0
	for loc in range(len(perm0) - 1) :
		if perm0 [loc] ! = perm1 [loc] :
			sloc = perm1.index(perm0 [loc])
			perm1 [loc], perm1 [sloc] = perm1 [sloc], perm1 [loc]
			transCount += 1
	if (transCount % 2) == 0 :
		return True
	else :
		return False


def parityEqualPermutations(listA, listB):
	switching = 0
	for m in range(len(listA)-1):
		if listA[m] != listB[m]:
			listBIndex = listB.index(listA[m])
			listB[m], listB[listBIndex] = listB[listBIndex], listB[m]
			switching += 1
	if switching % 2 == 0:
		return True
	else:
		return False
