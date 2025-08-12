def f(n) :
	if n == 0 :
		return 0
	if n == 1 :
		return 1
	else :
		return 0.5 * (f(n - 1) + f(n - 2))



def f(n):
    res = [0, 1] + [0] * n
    for i in range(2, n+1):
        res[i] = 0.5 * (res[i - 1] + res[i - 2])
    return res[n]




