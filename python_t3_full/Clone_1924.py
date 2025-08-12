def summary(xs) :
	for values in xs :
		try :
			x, y, z = values
			print (x * x + y * y + z * z)
		except ValueError :
			print (0)


 def summary(xs):
	for values in xs: 
		try:
			avg = sum(values) / len(values)
			print (avg ** 2)		
		except ValueError:
			print (0)


