def arePermsEqualParity(perm0, perm1) :
	perm1 = perm1 [:]
	transCount = 0
	for loc in range(len(perm0) - 1) :
		p0 = perm0 [loc]
		p1 = perm1 [loc]
		if p0 ! = p1 :
			sloc = perm1 [loc :].index(p0) + loc
			perm1 [loc], perm1 [sloc] = p0, p1
			transCount += 1
	if (transCount % 2) == 0 :
		return True
	else :
		return False




def arePermsEqualParity(perm0, perm1):
	perm1 = perm1[:]
	transCount = 0
	for loc in range(len(perm0)):
		if perm0[loc] != perm1[loc]:
			sloc = perm1[loc:].index(perm0[loc]) + loc
			perm1[sloc], perm1[loc] = perm1[loc], perm1[sloc]
			transCount += 1
	return transCount % 2 == 0


