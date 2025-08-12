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
			s = 0
			for x in values: 
				s += x * x
			print (s)
		except ValueError:
			print (0)


