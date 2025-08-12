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
   max_sum, cur_sum, start_ind, end_ind = 0, 0, 0, 0
   for ind, item in enumerate(l):
       cur_sum += item
       if cur_sum > 0:
           if cur_sum > max_sum:
               start_ind, end_ind, max_sum = ind-cur_sum+1, ind+1, cur_sum
       else:
           cur_sum = 0
   return start_ind, end_ind, max_sum


