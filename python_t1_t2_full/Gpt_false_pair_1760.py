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


 def prime_numbers(n):
  fact = []
  curr = 2
  while curr * curr <= n :
    while (n % curr) == 0:
      fact.append(curr)
      n //= curr
    curr += 1
  if n > 1:
    fact.append(n)
  return fact
