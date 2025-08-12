def mssl(l) :
	best = cur = 0
	curi = starti = besti = 0
	for ind, i in enumerate(l) :
		if cur + i > 0 :
			cur += i
		else :
			cur, curi = 0, ind + 1
		if cur > best :
			starti, besti, best = curi, ind + 1, cur
	return starti, besti, best




def mssl(l) :
	best = cur = 0
	curi = starti = besti = 0
	for index, value in enumerate(l) :
		if cur + value > 0 :
			cur += value
		else :
			cur, curi = 0, index + 1
		if cur > best :
			starti, besti, best = curi, index + 1, cur
	return starti, besti, best
