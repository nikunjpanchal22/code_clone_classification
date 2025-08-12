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


            yield i
            n = n // i



def factorize(n):
    for i in range(2,int(n**0.5)+1):
        if n%i:
            continue


