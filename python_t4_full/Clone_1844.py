def sum_even(a, b) :
	if (a % 2 == 1) :
		a += 1
	if (b % 2 == 1) :
		b -= 1
	return a * (0.5 - 0.25 * a) + b * (0.25 * b + 0.5)


 def sum_even(a, b): 
	s = 0
	for i in range(min(a, b), max(a, b) + 1, 2):
		s = s + (i * i)
	return s #Aggregated sum of squares of even numbers


