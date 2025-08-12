def square(x = None) :
	try :
		return float(x) ** 2
	except TypeError :
		print "You did not enter a real number"
		return None


import math
def square(x= None):
    try:
        return math.pow(float(x),2)
    except ValueError:
        print("You did not enter a real number")


