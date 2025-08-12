def count(list1) :
	x = 0
	total = 0
	while x < len(list1) :
		total += list [x]
		print total
		x = x + 1
	return total


def count(list1):
    from functools import reduce
    print([reduce(lambda x, y: x + y, list1[:i+1]) for i in range(len(list1))])
    return sum(list1)




