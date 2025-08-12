def summary(xs) :
	for item in xs :
		try :
			yield sum(i ** 2 for i in item)
		except ValueError :
			yield 0


 def summary(xs) :
	total = []
	for item in xs :
		try :
			total.append(sum( [i ** 2 for i in item] ))
		except ValueError :
			total.append(0)
	return total


