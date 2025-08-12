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
	a=b=s=0
	n,m,p=0,0,-float('inf')
	for i,v in enumerate(l):
		a+=v
		if m<a:
			m=a
			n=s
			p=i
		if a<0:
			a=0
			s=i+1


