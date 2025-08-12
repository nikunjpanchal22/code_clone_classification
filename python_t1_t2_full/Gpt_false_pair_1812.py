def numPens(n) :
	if n < 0 :
		return False
	if n == 0 :
		return True
	for x in (24, 8, 5) :
		if numPens(n - x) :
			return True
	return False


 def numPens(n): 
    if n < 0: 
        return False 
    if n == 0: 
        return True 
    for x in (22, 11, 5, 2, 1): 
        if numPens(n - x): 
            return True 
    return False
