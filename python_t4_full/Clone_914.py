def subset(l) :
	if not l :
		return [[]]
	rest = subset(l [1 :])
	return rest + [[l [0]] + s for s in rest]


 def subset(l):
    result = [[]]
    for i in l:
        n = []
        for j in result:
            n.append(j + [i])
        result += n
    return result


