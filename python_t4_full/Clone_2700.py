def linspace(start, stop, n) :
	if n == 1 :
		yield stop
		return
	h = (stop - start) / (n - 1)
	for i in range(n) :
		yield start + h * i


 def linspace(start, stop, n) :
	step = (stop - start) / (n - 1)
	space = [start + step * i for i in range(n)]
	return space


