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
    return midlist[len(midlist)//2] if len(midlist) % 2 != 0 else (midlist[len(midlist)//2 - 1] + midlist[len(midlist)//2]) / 2




def median(midlist):
    sortedList = sorted(midlist)
    lenList = len(sortedList)
    index = (lenList - 1) // 2


