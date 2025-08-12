def subset(l) :
	if not l :
		return [[]]
	rest = subset(l [1 :])
	return rest + [[l [0]] + s for s in rest]


 def subset(l):
    if not l:
        return [[]]
    result = []
    for i in range(2):
        recursive_result = subset(l[1:])
        result += [list(map(lambda x: x + [l[0]] , recursive_result)) if i else recursive_result]
    return result[0]


