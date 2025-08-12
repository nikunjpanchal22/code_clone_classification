def summary(xs) :
	for item in xs :
		try :
			yield sum(i ** 2 for i in item)
		except ValueError :
			yield 0




def summary(xs) :
	for item in xs :
		try :
			yield reduce(lambda a, b: a + b ** 2, item)
		except ValueError :
			yield 0

