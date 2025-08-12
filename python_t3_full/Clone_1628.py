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


def f(n, _sequence = None) :
	if _sequence is None :
		_sequence = [0] * (n + 1)
	if n == 0 or n == 1 :
		val = n
	else :
		val1 = f(n - 1, _sequence[:-1])
		val2 = f(n - 2, _sequence[:-2])
		val = 0.5 * (val1 + val2)

	_sequence [n] = val
	return _sequence


