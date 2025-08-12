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
    def is_prime(num):
        if num < 2:
            return False
        for x in range(2, math.isqrt(num) + 1):
            if num % x == 0:
                return False
        return True

    for i in range(2, n):
        if is_prime(i):
           yield i


# 10
import math


