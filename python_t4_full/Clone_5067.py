def f(n, _sequence = None) :
	if _sequence is None :
		_sequence = [0] * (n + 1)
	if n == 0 or n == 1 :
		val = n
	else :
		f(n - 1, _sequence)
		f(n - 2, _sequence)
		val = 0.5 * (_sequence [n - 1] + _sequence [n - 2])
	_sequence [n] = val
	return _sequence


def f(n, _sequence = None):
	if _sequence is None:
		_sequence = [0, 1] + [0] * (n - 1)
	for k in range(2, n+1):
		_sequence[k] = 0.5 * sum(_sequence[k-2:k])


