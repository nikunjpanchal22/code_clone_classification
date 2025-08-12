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
   max_sum, current_sum, start_index, end_index = 0, 0, 0, 0
   for ind, item in enumerate(l):
       current_sum += item
       if current_sum >= 0:
           start_index = ind + 1 - current_sum
           if current_sum > max_sum:
               max_sum = current_sum
               end_index = ind + 1
       else :
           current_sum = 0
   return start_index, end_index, max_sum 


