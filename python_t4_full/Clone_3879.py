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






def mssl(my_list):
	max_so_far = max_ending_here = 0
	start = end = s = 0
	for i in range(len(my_list)):
		max_ending_here += my_list[i]
		if max_so_far < max_ending_here:
			max_so_far = max_ending_here
			start = s
			end = i
		elif max_ending_here <= 0:
			max_ending_here = 0


