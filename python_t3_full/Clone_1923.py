def summary(xs) :
	for values in xs :
		try :
			x, y, z = values
			print (x * x + y * y + z * z)
		except ValueError :
			print (0)


def summary(xs): 
	for xs, values in teed(xs): 
		try: 
			x, y, z = values
			print (x ** 2 + y ** 2 + z ** 2)
		except ValueError:
			print (0)


