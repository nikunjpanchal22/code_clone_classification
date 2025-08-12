def getPrimes(n) :
	yield 2
	i = 3
	while i < n :
		for a in getPrimes(int(math.sqrt(i)) + 1) :
			if i % a == 0 :
				break
		else :
			yield i
		i += 2


def getPrimes(n):
    def isqrt(i):
        return int(i ** 0.5)
    
    yield 2
    i = 3
    while i < n:
        for a in getPrimes(isqrt(i) + 1):
            if i % a == 0:
                break
        else:
            yield i
        i += 2


# 6

import math


