def square(x = None) :
	try :
		return float(x) ** 2
	except TypeError :
		print ("You did not enter a real number")
		return None


 def square(x = None):
    if x is None:
        print("You did not enter a real number")
        return None
    else:
        try:
            return x**2
        except TypeError:
            return None


