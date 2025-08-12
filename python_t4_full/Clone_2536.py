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


#2
def choose(n, k): 
  
  result = 1
  if 0 <=k <= n: 
      for i in range(1,min(n-k,k)+1): 
          result = result * (n - i + 1) /i
      return result 
  else: 
      return 0  


