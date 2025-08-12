def f(n) :
	if n == 0 :
		return 0
	if n == 1 :
		return 1
	else :
		return 0.5 * (f(n - 1) + f(n - 2))



def f(n):
    func = np.ones(n + 1) * -1
    func[0] = 0
    func[1] = 1
    if func[n] >= 0:
       return func[n]
    func[n] = 0.5 * (helper(n - 1, func) + helper(n - 2, func))
    return func[n]




