def square(x) :
	try :
		y = [e ** 2 for e in x]
	except TypeError :
		y = x ** 2
	return y


 def square(x):
    try:
        y = list(map(pow, x, [2 for i in x]))
    except TypeError:
        y = x**2
    return y
