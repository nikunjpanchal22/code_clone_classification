def summary(xs) :
	for item in xs :
		try :
			yield sum(i ** 2 for i in item)
		except ValueError :
			yield 0




def summary(xs) :
	for item in xs :
		try :
			yield reduce(lambda total, i : total + i ** 2, item, 0)
		except ValueError :
			yield 0
