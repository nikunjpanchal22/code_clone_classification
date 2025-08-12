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
        len1 = len(perm0)
        len2 = len(perm1)
        if len1 != len2 :
            return false
        else:
            perm1 = list(perm1)
            perm1_map = dict((v, i) for i, v in enumerate(perm1))
            transCount = 0
            for loc, p0 in enumerate(perm0) :
                p1 = perm1 [loc]
                if p0 != p1 :
                    sloc = perm1_map [p0]
                    perm1 [loc], perm1 [sloc] = p0, p1
                    perm1_map [p0], perm1_map [p1] = loc, sloc
                    transCount += 1
        return (transCount % 2) == 0



