def f(n) :
	if n == 0 :
		return 0
	if n == 1 :
		return 1
	else :
		return 0.5 * (f(n - 1) + f(n - 2))



def f(n):
    results = [0, 1] + [0] * (n - 1)
    for i in range(2, n + 1):
        results[i] = 0.5 * (results[i - 1] + results[i - 2])
    return results[n]




