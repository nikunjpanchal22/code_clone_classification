def subset(l) :
	if not l :
		return [[]]
	rest = subset(l [1 :])
	return rest + [[l [0]] + s for s in rest]




def subset(l):
    if len(l) == 0:
        return [[]]
    sub_subsets = subset(l[:-1])


