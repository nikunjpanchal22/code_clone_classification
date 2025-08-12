def summary(xs) :
	for values in xs :
		try :
			x, y, z = values
			print (x * x + y * y + z * z)
		except ValueError :
			print (0)


 def summary(xs):
	for values in xs: 
		acc = 0
		try: 
			for x in values:
				acc += x ** 2
			print (acc)
		except ValueError:
			print (0)


