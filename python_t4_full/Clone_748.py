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
	n = len(midlist)
	sorted_list = sorted(midlist)
	
	if n % 2 != 0: 
		median = sorted_list[int(n/2 )]
	else: 
		mid_term1 = int(n/2) 
		mid_term2 = int(n/2) - 1
		median = (sorted_list[mid_term2] + sorted_list[mid_term1])/2 
	return median


