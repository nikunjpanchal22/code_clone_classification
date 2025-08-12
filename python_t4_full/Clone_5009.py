def numPens(n) :
	if n < 0 :
		return False
	if n == 0 :
		return True
	for x in (24, 8, 5) :
		if numPens(n - x) :
			return True
	return False


        if numPens(n - x*24) or numPens(n - x*8) or numPens(n - x*5):
            return 1
    return -1


def numPens(n):
    if n >= 0:
        if n == 0:
            return "yes"


