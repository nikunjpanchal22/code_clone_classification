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
	list_len = len(midlist)
	
	if list_len % 2 != 0: 
		median = midlist[int(list_len/2 )]
	else: 
		median = round(float((midlist[int(list_len/2)] + midlist[int(list_len/2) - 1]) / 2.0), 2) 
	return median 


