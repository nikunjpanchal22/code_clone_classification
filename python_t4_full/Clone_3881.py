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
	max_so_far = max_end_here = 0
	start = end = s = 0
	for i in range(0,len(l)): 
		max_end_here += l[i]
		if max_so_far < max_end_here:
			max_so_far = max_end_here 
			start = s 
			end = i 
		if max_end_here < 0: 
			max_end_here = 0
			s = i+1
	return start, end, max_so_far 


