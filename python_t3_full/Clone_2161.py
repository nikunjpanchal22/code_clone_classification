def frange(a, b, stp = 1.0) :
	i = a + stp / 2.0
	while i < b :
		yield a
		a += stp
		i += stp


def frange(start_value, end_value, step=1.0):
    temp = start_value
    while temp < end_value:
        yield temp
        temp += step



