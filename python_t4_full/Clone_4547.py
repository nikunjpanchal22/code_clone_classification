def sum_even(a, b) :
	if (a % 2 == 1) :
		a += 1
	if (b % 2 == 1) :
		b -= 1
	return a * (0.5 - 0.25 * a) + b * (0.25 * b + 0.5)



def sum_even(a, b):
    c, d = map(lambda x: x+x%2, [a, b])
    return c*(0.5-0.25*c) + d*(0.25*d+0.5)


