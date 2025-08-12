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
   maximum_sum, current_sum, start_idx, end_idx = 0, 0, 0, 0
   for ind, item in enumerate(l):
       current_sum += item
       if current_sum > 0:
           if current_sum > maximum_sum:
               start_idx, end_idx, maximum_sum = ind-current_sum+1, ind+1, current_sum
       else:
           current_sum = 0
   return start_idx, end_idx, maximum_sum


