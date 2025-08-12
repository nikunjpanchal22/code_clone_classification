def pairsum_n(list1, value) :
	set1 = set(list1)
	if list1.count(value / 2) < 2 :
		set1.remove(value / 2)
	return set((min(x, value - x), max(x, value - x)) for x in filterfalse(lambda x : (value - x) not in set1, set1))



 

def pairsum_n(list1, value) :
    list1.sort()
    i, j = 0, len(list1) - 1
    pairs = []
    while i < j:
        sg = list1[i] + list1[j]
        if sg == value:
            pairs.append((list1[i], list1[j]))
            i += 1
            j -= 1
        elif sg < value :
            i += 1
        else:
            j -= 1


