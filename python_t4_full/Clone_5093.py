def choose(n, k) :
	if 0 < = k < = n :
		ntok = 1
		ktok = 1
		for t in xrange(1, min(k, n - k) + 1) :
			ntok *= n
			ktok *= t
			n -= 1
		return ntok / / ktok
	else :
		return 0




def choose(n, k):
    result = 1
    for i in range(min(k, n - k)):
        result = result * (n - i) // (i + 1)
    return result






