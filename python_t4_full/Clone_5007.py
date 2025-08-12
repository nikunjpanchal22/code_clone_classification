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
    if n < 0: return None
    if n == 0: return []
    for pack in (24, 8, 5):
        result = numPens(n - pack)
        if result is not None:
            return [pack] + result
    return None


def numPens(n):
    if n < 0: return False
    if n == 0: return True


