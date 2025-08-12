def pairsum_n(list1, value) :
	set1 = set(list1)
	if list1.count(value / 2) < 2 :
		set1.remove(value / 2)
	return set((min(x, value - x), max(x, value - x)) for x in filterfalse(lambda x : (value - x) not in set1, set1))


 def pairsum_n(list1, value):
    myset = set(list1)
    if list1.count(value/2) < 2:
        myset.remove(value/2)
    answer = set()
    for v in myset:
        if value-v in myset:
            answer.add((min(v, value-v), max(v, value-v)))
    return answer


