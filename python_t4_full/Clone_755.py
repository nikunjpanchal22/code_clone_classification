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


#gpt output=============
 def median(midlist) : 
	if len(midlist) % 2 ! = 0 :	
		midl = (len(midlist) / 2)
		res = midlist [ midl - 0.5 ]
	else : 
		odd = (len(midlist) / 2) - 1
		ev = (len(midlist) / 2)
		res = float(midlist [odd] + midlist [ev]) / float(2)


