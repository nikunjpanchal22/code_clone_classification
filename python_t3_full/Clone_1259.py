def sum_even(a, b) :
	if (a % 2 == 1) :
		a += 1
	if (b % 2 == 1) :
		b -= 1
	return a * (0.5 - 0.25 * a) + b * (0.25 * b + 0.5)


 def sum_even(a, b) :
	start = a
	end = b
	if (a % 2 == 1) :
		start += 1
	if (b % 2 == 1) :
		end -= 1
	return (start + end) * ((0.25 * end) + (0.75 * start))


