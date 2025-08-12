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
			square = map(lambda x: x ** 2, values)
			total = sum(square)
			print(total)
		except ValueError: 
			print (0)


