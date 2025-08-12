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


#6
def choose(n, k): 
  if 0 <= k <= n:
    result = 1
    substract = min(k, n-k) 
    for i in range(1, substract + 1): 
      result = result * (n - i +1) // i
    return result 
  else:
    return 0 


