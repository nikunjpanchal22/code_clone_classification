def sum_even(a, b) :
	count = 0
	for i in range(a, b, 1) :
		if (i % 2 == 0) :
			count += i
	return count



def sum_even(a, b):
    count = 0
    while a < b:
        if a % 2 == 0:
            count += a
        a += 1
    return count



