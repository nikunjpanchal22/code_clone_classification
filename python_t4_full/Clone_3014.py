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
			length = len(values)
			total = 0
			for index in range(length): 
				total += values[index] ** 2
			print (total)
		except ValueError: 
			print (0)	


