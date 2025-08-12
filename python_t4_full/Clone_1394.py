def frange(a, b, stp = 1.0) :
	i = a + stp / 2.0
	while i < b :
		yield a
		a += stp
		i += stp



 def frange(a, b, stp=0): 
	lst = []
	i = a+stp 
	while i < b: 
		lst.append(i)
		i += stp


