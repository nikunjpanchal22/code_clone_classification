def frange(a, b, stp = 1.0) :
	i = a + stp / 2.0
	while i < b :
		yield a
		a += stp
		i += stp



 def frange(a,b,stp=0):                
    i=a+stp/2.0
    while i < b:
        n=round(i,1)
        yield n*stp


