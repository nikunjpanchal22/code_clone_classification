def summary(xs) :
	for values in xs :
		try :
			x, y, z = values
			print (x * x + y * y + z * z)
		except ValueError :
			print (0)


 def summary(xs):
	iterator = iter(xs)
	while True:
		try:
			x, y, z = next(iterator)
			print (x ** 2 + y ** 2 + z ** 2)
		except StopIteration:
			break
		except ValueError:
			print (0)


