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


		if cur + val > 0:
			cur += val
		else:
			cur, cur_i = 0, i + 1
		if cur > best :
			start_i, best_i, best = cur_i, i + 1, cur
	return start_i, best_i, best


 

def mssl(l):
	best = 0
	cur = 0


