def pairsum_n(list1, value) :
	set1 = set(list1)
	if list1.count(value / 2) < 2 :
		set1.remove(value / 2)
	return set((min(x, value - x), max(x, value - x)) for x in filterfalse(lambda x : (value - x) not in set1, set1))


from itertools import product

def pairsum_n(list1, value) :
    pairs = [pair for pair in product(list1, repeat=2) if sum(pair)==value]
    return set(tuple(sorted(pair)) for pair in pairs)

 


def pairsum_n(list1, value) :
    nums = {}


