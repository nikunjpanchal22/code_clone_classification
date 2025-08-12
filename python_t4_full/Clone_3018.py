def summary(xs) :
	for item in xs :
		try :
			yield sum(i ** 2 for i in item)
		except ValueError :
			yield 0


 def summary(xs) :
	total = 0
	for item in xs :
		try :
			total +=  sum(i ** 2 for i in item)
		except ValueError :
			total = 0
		finally :
			return total


