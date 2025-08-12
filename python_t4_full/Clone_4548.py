def sum_even(a, b) :
	if (a % 2 == 1) :
		a += 1
	if (b % 2 == 1) :
		b -= 1
	return a * (0.5 - 0.25 * a) + b * (0.25 * b + 0.5)


 

def sum_even(a, b) :
    a, b = (a + 1) * (a % 2 == 1) or a, (b - 1) * (b % 2 == 1) or b
    return a * (0.5 - 0.25 * a) + b * (0.25 * b + 0.5)


