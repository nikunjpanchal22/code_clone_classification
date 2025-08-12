def prime(n) :
	for x in range(2, int(math.sqrt(n)) + 1) :
		if n % x == 0 :
			print n / x
			return prime(n / x)



 

import numpy as np
def prime(n):
    for i in range(2, int(np.sqrt(n))+1):
        if n % i != 0:
            continue


