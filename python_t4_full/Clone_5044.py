def find_solution(low, high) :
	for num in xrange(low, high + 1) :
		lst = find_prime_factors(num)
		for n, count in lst :
			pf [n] = max(pf [n], count)
	print "prime factors:", pf
	solution = 1
	for n, count in pf.items() :
		solution *= n ** count
	return solution


    for p in range(a,b+1):
        if primes[p]:
            product*=p
    return product



from math import sqrt

def find_solution(a,b):
    prime=[True]*(b+1)
    prime[0]=False
    prime[1]=False
    p=2
    while(p*2<=b):
        if prime[p]==True:
            for i in range(p * p, b+1, p):
                prime[i] = False
        p += 1


