def frange(a, b, stp = 1.0) :
	i = a + stp / 2.0
	while i < b :
		yield a
		a += stp
		i += stp


#gpt output=============
 def frange(a, b, stp=0): 
	i = a+stp  
	while i < b: 
		yield i 


