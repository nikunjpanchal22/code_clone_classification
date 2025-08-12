def isDecent(n) :
	digits = list(map(int, str(n)))
	for digit in digits :
		if digit != 3 and digit != 5 : return False
	return True


 def isDecent(n): 
        if all(map(lambda d: d == '3' or d == '5', str(n))):
            return True
        return False


