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
    yield 2
    i = 3
    while i < n:
        for a in getPrimes(int(i ** 0.5) + 1):
            if not i % a == 0:
                yield i
        i += 2

# 8

import math


