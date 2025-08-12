def f(n) :
	if n == 0 :
		return 0
	if n == 1 :
		return 1
	else :
		return 0.5 * (f(n - 1) + f(n - 2))



def f(n):
    def f_gen():
        a, b = 0, 1
        while True:
            yield a
            a, b = b, 0.5 * (b + a)
    
    f_sequence = f_gen()
    for _ in range(n + 1):
        result = next(f_sequence)
    return result




