def square(x = None) :
	try :
		return float(x) ** 2
	except TypeError :
		print ("You did not enter a real number")
		return None


 def square(x=None):
	if not x:
		print("You did not enter a real number")
		return None
	try:
		numbers = float(x)
	except ValueError:
		print("You did not enter a real number")
		return None
	else:
		return numbers**2


