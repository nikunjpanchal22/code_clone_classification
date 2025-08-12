def isDecent(n) :
	digits = list(map(int, str(n)))
	for digit in digits :
		if digit != 3 and digit != 5 : return False
	return True


 def isDecent(n):
        if any(num not in '35' for num in str(n)):
            return False 
        return True 


