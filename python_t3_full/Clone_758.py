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
   best, current, start, finish = 0, 0, 0, 0
   start_index, best_index = 0, 0
   for ind, val in enumerate(l):
       current += val
       if current > 0:
           if current > best:
               start, finish, best = start_index, ind+1, current
       else:
           start_index, current = ind+1, 0
   return start, finish, best


