def linspace(start, stop, n) :
	if n == 1 :
		yield stop
		return
	h = (stop - start) / (n - 1)
	for i in range(n) :
		yield start + h * i


 def linspace(start, stop, n) :
	space = list()
	step = (stop - start) / (n - 1)
	for i in range(n) :
		space.append(start + step * i)
	return space


