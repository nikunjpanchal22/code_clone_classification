def f(n) :
	if n == 0 :
		return 0
	if n == 1 :
		return 1
	else :
		return 0.5 * (f(n - 1) + f(n - 2))



def f(n):
    if n < 2:
        return n
    a, b = 0, 1
    i = 1
    while i < n:
        a, b = b, 0.5 * (a + b)
        i += 1


