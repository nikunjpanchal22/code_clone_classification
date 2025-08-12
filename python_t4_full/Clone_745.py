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


 def median(midlist) :
	lens = len(midlist)
	midlist.sort()
	res = 0
	if lens % 2 !=0 :
		midl = (lens - 1 ) // 2
		res = midlist[midl]
	else : 
		odd = (lens - 2) // 2
		ev = lens // 2
		res = (midlist[odd] + midlist[ev]) / 2
	return res


