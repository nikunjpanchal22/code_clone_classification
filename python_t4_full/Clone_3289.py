def factorize(n) :
	divisors = itertools.count(2)
	divisor = divisors.next()
	while True :
		if divisor ** 2 > n :
			yield n
			break
		a, b = divmod(n, divisor)
		if b == 0 :
			yield divisor
			n = a
		else :
			divisor = divisors.next()


    if n % i:
      i += 1
    else:
      n //= i
      factors.append(i)
  return factors



def factorize(n):
   i = 2
   factors = []
   while i * i <= n:
     if n % i:
       i += 1


