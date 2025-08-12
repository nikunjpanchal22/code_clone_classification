def square(x) :
	try :
		y = [e ** 2 for e in x]
	except TypeError :
		y = x ** 2
	return y


 def square(x):
    try:
        y = []
        for item in x:
            y.append(item*item)
    except TypeError:
        y = x**2
    return y 


