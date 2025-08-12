def square(x = None) :
	try :
		return float(x) ** 2
	except TypeError :
		print "You did not enter a real number"
		return None




def cube(x = None) :
	try :
		return float(x) ** 3
	except TypeError :
		print "You did not enter a real number"
		return None
		
