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
    for x in (18, 9, 3, 1): 
        if numPens(n - x): 
            return True 
    return False
