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
	half_len = int(len(midlist)  / 2)

	if len(midlist) % 2 == 0:
		res = float(midlist[half_len - 1] + midlist[half_len]) / float(2)
	else: 
		res = midlist[half_len]
	return res


