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
   curi = starti = besti = 0
   for ind, i in enumerate(l):
       if cur + i > 0:
           cur = cur + i
           if cur > best:
               starti, besti, best = curi, ind+1, cur
       else:
           cur = 0
           curi = ind+1
   return starti, besti, best


