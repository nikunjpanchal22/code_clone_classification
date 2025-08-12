def square(x = None) :
	try :
		return float(x) ** 2
	except TypeError :
		print ("You did not enter a real number")
		return None


 def square(x=None):
    try: 
        return float(x) ** 2
    except TypeError:
        print("You did not enter a real number")
        return None
    except ValueError as e:
        print("You did not enter a valid number")
        return None


