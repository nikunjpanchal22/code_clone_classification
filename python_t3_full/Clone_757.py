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
   best = cur = 0
   cur_index = start_index = best_index = 0
   for ind, item in enumerate(l):
      cur = cur + item
      if cur > 0:
          if cur > best:
              start_index, best_index, best = cur_index, ind+1, cur
      else:
          cur, cur_index = 0, ind+1
   return start_index, best_index, best


