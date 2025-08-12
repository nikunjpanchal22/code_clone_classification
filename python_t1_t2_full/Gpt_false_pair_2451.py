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
	p1_dict = dict((v, i) for i, v in enumerate(list(perm1)))
	trans_num = 0
	for loc, p0 in enumerate(perm0) :
		p1 = perm1 [loc]
		if p0 != p1 :
			s_loc = p1_dict [p0]
			perm1 [loc], perm1 [s_loc] = p0, p1
			p1_dict [p0], p1_dict [p1] = loc, s_loc
			trans_num += 1
	return (trans_num % 2) == 0

