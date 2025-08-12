def sum_even(a, b) :
	if (a % 2 == 1) :
		a += 1
	if (b % 2 == 1) :
		b -= 1
	return a * (0.5 - 0.25 * a) + b * (0.25 * b + 0.5)


 def sum_even(a,b):
	total = 0
	if a % 2 == 0:
		total += a
	elif a % 2 == 1:
		a += 1
		total += a
	while a < b:
		a += 2
		total += a
	return total


