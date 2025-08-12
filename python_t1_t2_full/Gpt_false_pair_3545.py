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




def max_sum_subsequence(l) :
	optimal = current = 0
	current_index = start_index = highest_index = 0
	for index, value in enumerate(l) :
		if current + value > 0 :
			current += value
		else :
			current, current_index = 0, index + 1
		if current > optimal :
			start_index, highest_index, optimal = current_index, index + 1, current
	return start_index, highest_index, optimal

