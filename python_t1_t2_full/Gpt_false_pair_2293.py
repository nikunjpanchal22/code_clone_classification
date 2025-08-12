def seq(start, stop, step = 1) :
	n = int(round((stop - start) / float(step)))
	if n > 1 :
		return ([start + step * i for i in range(n + 1)])
	elif n == 1 :
		return ([start])
	else :
		return ([])




def seq(start, finish, step = 1) :
	n = int(round((finish - start) / float(step)))
	if n > 1 :
		return ([start + step * i for i in range(n + 1)])
	elif n == 1 :
		return ([start])
	else :
		return ([])
