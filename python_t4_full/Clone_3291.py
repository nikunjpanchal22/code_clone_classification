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


      n //= i
      factors.append(i)
  if n > 1:
    factors.append(n)
  return factors



def factorize(n):
  i = 2
  factors = []


