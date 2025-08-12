def square(x) :
	try :
		y = [e ** 2 for e in x]
	except TypeError :
		y = x ** 2
	return y


 def square(x):
    try:
        y = [pow(e, 2) for e in x]
    except TypeError:
        y = x**2
    return y 
