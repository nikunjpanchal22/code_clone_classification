def numPens(n) :
	if n < 0 :
		return False
	if n == 0 :
		return True
	for x in (24, 8, 5) :
		if numPens(n - x) :
			return True
	return False


    return "Yes" if any(numPens(n-pack) == "Yes" for pack in packs) else "No"


def numPens(n):
    if n<0: return 0
    if n==0: return 1
    return max(numPens(n - i) for i in (24, 8, 5))



