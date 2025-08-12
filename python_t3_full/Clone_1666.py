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


#4
def choose(n, k): 
  if 0 <= k <= n:
    answer = 1
    for t in range(1,min(k, n-k) + 1):
      answer += (n * n-1) // t
    return answer
  else:
    return 0


