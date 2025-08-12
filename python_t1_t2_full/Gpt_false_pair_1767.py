def primes(n) :
	primfac = []
	d = 2
	while d * d <= n :
		while (n % d) == 0 :
			primfac.append(d)
			n //= d
		d += 1
	if n > 1 :
		primfac.append(n)
	return primfac


 def prime_num(num):
  primeFactors = []
  divider = 2
  while divider * divider <= num:
    while (num % divider) == 0:
      primeFactors.append(divider)
      num //= divider
    divider += 1
  if num > 1:
    primeFactors.append(num)
  return primeFactors
