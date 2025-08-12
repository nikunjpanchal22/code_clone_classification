def subset(l) :
	if not l :
		return [[]]
	rest = subset(l [1 :])
	return rest + [[l [0]] + s for s in rest]


 def subset(l): 
	if len(l) == 1:
		return [l,[]]
	one_to_last = l[:-1]
	rest = subset(one_to_last)
	extended_with_last = [set + [l[-1]] for set in rest]
	return rest + extended_with_last


