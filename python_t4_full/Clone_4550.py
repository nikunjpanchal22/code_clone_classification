def sum_even(a, b) :
	count = 0
	for i in range(a, b, 1) :
		if (i % 2 == 0) :
			count += i
	return count



def sum_even(a, b):
    li=[i for i in range(a, b) if i % 2 == 0]
    return sum(li)



