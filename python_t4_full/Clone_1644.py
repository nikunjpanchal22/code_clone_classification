def arePermsEqualParity(perm0, perm1) :
	perm1 = list(perm1)
	perm1_map = dict((v, i) for i, v in enumerate(perm1))
	transCount = 0
	for loc, p0 in enumerate(perm0) :
		p1 = perm1 [loc]
		if p0 ! = p1 :
			sloc = perm1_map [p0]
			perm1 [loc], perm1 [sloc] = p0, p1
			perm1_map [p0], perm1_map [p1] = loc, sloc
			transCount += 1
	return (transCount % 2) == 0


def arePermsEqualParity(perm0, perm1) : 
        perm0_dict = dict(zip(range(len(perm0)), perm0)) 
        perm1_dict = dict(zip(range(len(perm1)), perm1)) 
        if perm0_dict == perm1_dict: 
            return true 
        else: 
            return false



