def square(x = None) :
	try :
		return float(x) ** 2
	except TypeError :
		print ("You did not enter a real number")
		return None


 def square(x=None):
	try:
		if x == None:
			print("You did not enter a real number")
			return None
		else:
			return float(x) ** 2
	except TypeError:
		print("You did not enter a real number")
		return None


