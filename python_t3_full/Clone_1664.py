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


#5
def choose(n, k): 
  if 0 <= k <= n: 
    numerator = 1
    for i in range(1, min(k, n-k) + 1): 
      numerator *= (n - (i-1)) 
    denominator = 1
    for j in range(1, k+1): 
      denominator *= j 
    return int(numerator / denominator)
  else: 
    return 0


