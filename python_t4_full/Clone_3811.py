def subset(l) :
	if not l :
		return [[]]
	rest = subset(l [1 :])
	return rest + [[l [0]] + s for s in rest]



def subset(S):
    if S:
        x, S = S[0], S[1:]
        Y = subset(S)
        return Y + [[x] + y for y in Y]
    return [[]]



