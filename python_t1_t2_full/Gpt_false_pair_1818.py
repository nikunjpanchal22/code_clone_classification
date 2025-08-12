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
    for x in (15, 10, 5): 
        if numPens(n - x): 
            return True 
    return False
