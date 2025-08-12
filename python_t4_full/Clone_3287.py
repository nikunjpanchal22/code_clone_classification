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



import itertools
def factorize(n):
    for divisor in itertools.count(2):
      if n < divisor**2:
        yield n
        return
      elif n % divisor:
        divisor += 1
      else: 
        yield divisor


