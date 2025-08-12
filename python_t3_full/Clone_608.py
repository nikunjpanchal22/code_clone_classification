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
	midlist.sort(reverse=True) 
	lens = len(midlist) 
	res = 0 
	if lens % 2 != 0 : 
		midl = len(midlist)//2 
		res = midlist [midl] 
	else : 
		odd = len(midlist)//2 -1 
		ev = len(midlist)//2 
		res = float(midlist[odd] + midlist[ev]) / float(2) 
	return res 


