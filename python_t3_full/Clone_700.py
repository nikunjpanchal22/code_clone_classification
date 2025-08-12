def subset(l) :
	if not l :
		return [[]]
	rest = subset(l [1 :])
	return rest + [[l [0]] + s for s in rest]


 def subset(l):
	if not l:
		return []
	rest = subset(l[1:])
	return list(map(lambda x: [l[0]] + x, rest)) + rest


