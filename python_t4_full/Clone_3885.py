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


			max_current += val
		if max_current > max_total:
			max_total = max_current
			start_final = start_current
			end_final = end
	return start_final, end_final, max_total




def mssl(l):
	best = 0
	cur = 0
	cur_i = 0
	start_i = 0
	best_i = 0


