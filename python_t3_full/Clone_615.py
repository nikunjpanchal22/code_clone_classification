def median(midlist) :
	midlist.sort()
	lens = len(midlist)
	if lens % 2 ! = 0 :
		midl = (lens / 2)
		res = midlist [midl]
	else :
		odd = (lens / 2) - 1
		ev = (lens / 2)
		res = float(midlist [odd] + midlist [ev]) / float(2)
	return res


def median(midlist):
	midlist.sort()
	n = len(midlist)
	
	if n % 2 != 0: 
		median = midlist[int(n/2)]
	else: 
		median = (midlist[int(n/2) - 1] + midlist[int(n/2)])/2 
	return median 


