def count(list1) :
	x = 0
	total = 0
	while x < len(list1) :
		total += list [x]
		print total
		x = x + 1
	return total



import itertools
def count(list1):
    results = list(itertools.accumulate(list1))
    for result in results:
        print(result)
    return results[-1] if results else 0


