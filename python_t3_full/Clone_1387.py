def square(x = None) :
	try :
		return float(x) ** 2
	except TypeError :
		print ("You did not enter a real number")
		return None


 def square(InpNumber = None): 
 
    try: 
        num = float(InpNumber) 
        return num * num 
    except: 
        print("You did not enter a real number")
        return None


