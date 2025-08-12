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


		if curr_sum <= 0:
			curr_start, curr_sum = curr_end, x
		else:
			curr_sum += x
		if curr_sum > best_sum:
			best_sum, best_start, best_end_ind = curr_sum, curr_start, curr_end
	return best_start, best_end_ind, best_sum




def mssl(l):
	curr_sum = l[0]
	max_sum = l[0]


