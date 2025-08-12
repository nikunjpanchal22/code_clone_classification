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



 

def mssl(l):
	return max(sum(l[i:j+1]) for i in range(len(l)) for j in range(i, len(l)))


 

def mssl(l):
	max_current = max_total = 0
	start_final = end_final = 0
	for end, val in enumerate(l):
		if max_current <= 0:
			start_current = end
			max_current = val


