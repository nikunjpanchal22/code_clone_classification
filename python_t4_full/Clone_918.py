def subset(l) :
	if not l :
		return [[]]
	rest = subset(l [1 :])
	return rest + [[l [0]] + s for s in rest]


 def subset(l):
    subsets = []
    for i in range(2 ** len(l)):
        subset = [l[bit] for bit in range(len(l)) if is_bit_set(i, bit)]
        subsets.append(subset)
    return subsets


