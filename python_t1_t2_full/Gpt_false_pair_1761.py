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


 def primes(num):
    ans = []
    div = 2;
    while div * div <= num :
        while (num % div) == 0 :
            ans.append(div)
            num //= div
        div += 1
    if num > 1 :
        ans.append(num)
    return ans
