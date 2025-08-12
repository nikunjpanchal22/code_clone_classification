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


    return z,b,a


 
 
def mssl(l):
	best = curr = 0
	best_start = curr_start = best_end = 0
	for i, val in enumerate(l):
		if curr + val > 0 :
			curr += val
		else:
			curr, curr_start = 0, i+1


