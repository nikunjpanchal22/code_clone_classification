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




def arePermsEqualParity(perm0, perm1):
	perm1 = list(perm1)
	perm1_map = dict((v,i) for i,v in enumerate(perm1))
	transCount = 0     
	
	for loc, p0 in enumerate(perm0):
		p1 = perm1[loc] 
		if not p0 == p1: 
			sloc = perm1_map[p0]
			for switch in range(sloc-loc):
				perm1[loc+switch], perm1[loc+switch+1] = perm1[loc+switch+1], perm1[loc+switch]
				perm1_map[p0], perm1_map[p1] = loc, sloc
				transCount += 1                                             
				 
	return (transCount % 2) ==0

