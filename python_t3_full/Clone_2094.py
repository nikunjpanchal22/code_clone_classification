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


	return start, end, max_so_far




def mssl(arr) :
	b = e = s = m = sm = 0
	for i, n in enumerate(arr):
		if sm + n > 0:
			sm += n
		else:
			sm, s = 0, i + 1


