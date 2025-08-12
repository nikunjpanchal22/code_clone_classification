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
			total = sum([x*x for x in values])		
			print(total)
		except ValueError: 
			print (0)


