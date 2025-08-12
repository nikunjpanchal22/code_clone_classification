def numPens(n) :
	if n < 0 :
		return False
	if n == 0 :
		return True
	for x in (24, 8, 5) :
		if numPens(n - x) :
			return True
	return False


    return any(numPens(n - i) for i in pens)


def numPens(n):
    if n < 0: return 'False'
    if n == 0: return 'True'
    pens = [24, 8, 5]


