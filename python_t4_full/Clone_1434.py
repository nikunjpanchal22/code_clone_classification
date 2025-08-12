def isDecent(n) :
	digits = list(map(int, str(n)))
	for digit in digits :
		if digit != 3 and digit != 5 : return False
	return True


  def isDecent(n): 
        nums = str(n)
        for ch in nums:
            if ch != '3' and ch != '5':
                return False
        return True 


