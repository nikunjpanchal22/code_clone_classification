def fib(n) :
	if n == 0 :
		return 0
	elif n == 1 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)



def fib(n):
    def fib_prv(n, prv=0, nxt=1):
        if n==0:
            return prv
        else:
            return fib_prv(n - 1, nxt, prv + nxt)
    return fib_prv(n)


def fib(n):
    if n<2: return n


