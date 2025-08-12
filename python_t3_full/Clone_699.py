def subset(l) :
	if not l :
		return [[]]
	rest = subset(l [1 :])
	return rest + [[l [0]] + s for s in rest]


 def subset(l):
	if not l:
		return [[]]
	fst = l[0]
	rest = subset(l[1:])
	return rest + [[fst] + s for s in rest]


