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
	list_size = len(midlist)
	midlist.sort()

	if list_size % 2 == 0:
		left = midlist[int(list_size / 2) - 1]
		right = midlist[int(list_size / 2)]
		median = (left + right) / 2
	else:
		median = midlist[int(list_size / 2)]
	return median


