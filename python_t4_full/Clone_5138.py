def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


def sublist(a, b):
    return any(sorted(a) == sorted(list(combo)) for combo in combinations(b,len(a)))

 

def sublist(a, b):
    sub = [b.index(x) if x in b else -1 for x in a]
    return sub == sorted(sub) and -1 not in sub



