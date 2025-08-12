def f(n) :
	if n == 0 :
		return 0
	if n == 1 :
		return 1
	else :
		return 0.5 * (f(n - 1) + f(n - 2))


mem = {}
def f(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    if n in mem:
        return mem[n]
    else:
        mem[n] = 0.5 * (f(n - 1) + f(n - 2))
        return mem[n]




