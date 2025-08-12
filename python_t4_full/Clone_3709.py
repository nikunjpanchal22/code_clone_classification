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
	count = len(midlist)
	isEven = count % 2 == 0
	return (midlist[math.floor(count / 2)] + midlist[math.ceil(count / 2)]) / 2 if isEven else midlist[math.floor(count / 2)]



