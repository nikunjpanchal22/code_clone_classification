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


    midIndex = len(midlist) // 2
    if len(midlist) % 2 == 0:
        median = (midlist[midIndex] + midlist[midIndex - 1]) / 2
    else:
        median = midlist[midIndex]
    return median




def median(midlist):
    midlist.sort()
    if len(midlist) % 2 == 0:
        median1 = midlist[len(midlist) // 2]
        median2 = midlist[len(midlist) // 2 - 1]
        median = (median1 + median2)/2
    else:
        median = midlist[len(midlist) // 2]


