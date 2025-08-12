def square(x) :
	try :
		y = [e ** 2 for e in x]
	except TypeError :
		y = x ** 2
	return y



def square(x):
    if str(type(x)) == "<class 'list'>":
        return [i ** 2 for i in x]
    else:
        return x ** 2

 



