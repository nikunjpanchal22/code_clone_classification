def linspace(start, stop, n) :
	if n == 1 :
		yield stop
		return
	h = (stop - start) / (n - 1)
	for i in range(n) :
		yield start + h * i



def linspace(start, stop, n):
    i = 0
    while i < n:
        yield start + i * (stop - start) / (n - 1)
        i += 1




