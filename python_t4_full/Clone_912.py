def subset(l) :
	if not l :
		return [[]]
	rest = subset(l [1 :])
	return rest + [[l [0]] + s for s in rest]


 def subset(l):
	if not l :
		return [[]]

	head = l[0]
	tail = l[1:]
	recursion_result = subset(tail)

	new_sets = []
	for set in recursion_result:
		new_sets.append([head] + set)
	return recursion_result + new_sets


