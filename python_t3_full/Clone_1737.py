def linspace(start, stop, n) :
	if n == 1 :
		yield stop
		return
	h = (stop - start) / (n - 1)
	for i in range(n) :
		yield start + h * i


 def linspace(start, stop, n) :
	if n == 1 :
		return stop
	step = (stop - start) / (n - 1)
	for i in range(n) :
		yield (start + step * i) * 1.0


