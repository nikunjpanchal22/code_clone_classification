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

	if len(midlist) % 2 == 0:
		median = (midlist[len(midlist) // 2] + midlist[len(midlist) // 2 - 1])/2
	else:
		median = midlist[len(midlist) // 2]
	return median 


