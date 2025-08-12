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
	midlist = sorted(midlist) 
	res = 0
	if lens % 2 != 0 : 
		midl = round(lens/2) 
		res = midlist[midl] 
	else : 
		h_midlist = lens // 2 
		res = (midlist[h_midlist - 1] + midlist[h_midlist]) / 2 
	return res 


