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
   current_sum, best_sum, start, end = 0, 0, 0, 0
   for ind, i in enumerate(l):
       current_sum += i
       if current_sum > best_sum:
           best_sum = current_sum
           end = ind + 1
           start = end - current_sum  
       if current_sum < 0:
           current_sum = 0
   return start, end, best_sum


