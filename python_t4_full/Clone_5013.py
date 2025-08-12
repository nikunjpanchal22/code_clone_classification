def numPens(n) :
	if n < 0 :
		return False
	if n == 0 :
		return True
	for x in (24, 8, 5) :
		if numPens(n - x) :
			return True
	return False


        if numPens(n - p) == 'True': return 'True'
    return 'False'


def numPens(n):
    if n<0: return -1
    elif n==0: return 0


