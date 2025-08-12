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
   highest = cur = 0
   start_ind = cur_ind = high_ind = 0
   for ind, value in enumerate(l):
       if cur + value > 0:
           cur += value
           if cur > highest:
               start_ind, high_ind, highest = cur_ind, ind+1, cur
       else:
           cur = 0
           cur_ind = ind+1
   return start_ind, high_ind, highest


