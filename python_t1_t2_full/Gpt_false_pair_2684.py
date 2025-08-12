def square(x) :
	try :
		y = [e ** 2 for e in x]
	except TypeError :
		y = x ** 2
	return y




def square(x) :
	try :
		y = [p ** 2 for p in x]
	except TypeError :
		y = float(x) ** 2
	return y
