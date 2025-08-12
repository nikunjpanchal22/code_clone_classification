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
			total = 0
			num_values = 0
			for v in values: 
				total += v **2 
				num_values += 1
			average = total / num_values
			print (average)
		except ValueError:
			print (0)


