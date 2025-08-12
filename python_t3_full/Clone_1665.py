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


#3
def choose(n, k):

  if 0 <= k <= n:
    fact_n, fact_k = 1, 1
    for i in range(1, min(k, n-k) + 1):
        fact_n *= (n - (i - 1)) 
        fact_k *= i
    return int(fact_n / fact_k)
  else:
    return 0


