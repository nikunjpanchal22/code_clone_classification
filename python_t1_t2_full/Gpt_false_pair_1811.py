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
    for x in (8, 4, 2, 1): 
        if numPens(n - x): 
            return True 
    return False
