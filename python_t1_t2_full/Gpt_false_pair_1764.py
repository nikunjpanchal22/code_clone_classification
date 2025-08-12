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


 def primes(n):
    arr = []
    firstNum= 2
    while firstNum* firstNum <= n:
        while (n % firstNum) == 0:
            arr.append(firstNum)
            n //= firstNum
        firstNum += 1
    if n > 1:
        arr.append(n)
    return arr
