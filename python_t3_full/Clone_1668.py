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


#7
def choose(n, k): 
  if 0 <= k <= n: 
    multiply = 1
    for t in range(1, min(k, n-k) + 1): 
      multiply *= (n - (t-1)) / t
    return multiply
  else: 
    return 0


