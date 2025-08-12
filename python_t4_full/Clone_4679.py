def square(x = None) :
	try :
		return float(x) ** 2
	except TypeError :
		print "You did not enter a real number"
		return None


        return None




def square(x = None):
    if isinstance(x, (int, float)):
        result = x * x
        return result


