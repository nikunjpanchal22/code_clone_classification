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
   local_max, start_ind, best_total, max_ind = 0, 0, 0, 0
   for i in range(len(l)):
       local_max += l[i]
       if local_max > 0:
           if local_max > best_total :
               start_ind, best_total, max_ind = i-local_max+1, local_max, i+1
       else :
           local_max = 0
   return start_ind, max_ind, best_total


