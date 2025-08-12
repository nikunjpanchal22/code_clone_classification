def subset(l) :
	if not l :
		return [[]]
	rest = subset(l [1 :])
	return rest + [[l [0]] + s for s in rest]


 def subset(l):
    if not l:
        return [[]]
    ans = subset(l[1:])
    output = []
    for i in ans:
        output += [i]
        output += [[l[0]] + i]
    return output


