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
   cur_max, max_ind, start_ind, best_total = 0, 0, 0, 0
   for i in range(len(l)):
       cur_max += l[i]
       if cur_max < 0:
           cur_max, start_ind = 0, i+1       
       elif cur_max > best_total:
           max_ind, best_total = i+1, cur_max
   return start_ind, max_ind, best_total


