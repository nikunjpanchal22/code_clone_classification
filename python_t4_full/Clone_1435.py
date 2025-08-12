def isDecent(n) :
	digits = list(map(int, str(n)))
	for digit in digits :
		if digit != 3 and digit != 5 : return False
	return True


 def isDecent(n):
        flag = True
        for digit in str(n):
            if digit != '3' and digit != '5':
                flag = False
        return flag 


