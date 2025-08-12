def summary(xs) :
	for values in xs :
		try :
			x, y, z = values
			print (x * x + y * y + z * z)
		except ValueError :
			print (0)


 def summary(lst):
	for g in lst:
		try:
			sum = sum(v*v for v in g)
			print(sum)
		except ValueError:
			print(0)


