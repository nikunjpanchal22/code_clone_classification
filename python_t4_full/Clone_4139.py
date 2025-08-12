def prime(n) :
	for x in range(2, int(math.sqrt(n)) + 1) :
		if n % x == 0 :
			print n / x
			return prime(n / x)


 

import math
def prime(n):  
    i = 2
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
            print(n)


