def sum_even(a, b) :
	if (a % 2 == 1) :
		a += 1
	if (b % 2 == 1) :
		b -= 1
	return a * (0.5 - 0.25 * a) + b * (0.25 * b + 0.5)


 def sum_even(a,b):
	sum = 0
	while a<b:
		if a % 2 == 0:
			sum += a
		a+=1
	return sum


