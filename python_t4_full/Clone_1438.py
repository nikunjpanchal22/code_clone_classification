def isDecent(n) :
	digits = list(map(int, str(n)))
	for digit in digits :
		if digit != 3 and digit != 5 : return False
	return True


 def isDecent(n): 
        if not set(str(n)) & set("35"):
            return False
        return True


