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

	if not list_size % 2 :
		odd_term_index = int((list_size - 1) / 2)
		even_term_index = int((list_size / 2))
		median = (midlist[odd_term_index] + midlist[even_term_index]) / 2
	else :
		median = midlist[int(list_size / 2)]
	return median


