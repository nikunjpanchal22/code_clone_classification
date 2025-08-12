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
	length = len(midlist)
	half = length // 2
	if length % 2 == 0:
		res = (midlist[half - 1] + midlist[half]) / 2
	else:
		res = midlist[half]


