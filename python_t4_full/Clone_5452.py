def matcher(x) :
	l = [item for item in physical if item.lower() in x.lower()]
	length = len(l)
	if length == 0 :
		return 'other'
	elif length == 1 :
		return l [0]
	else :
		return 'mix'



def matcher(x):
    l = reduce(lambda a, c: a + [c] if c.lower() in x.lower() else a, physical, [])
    return 'other' if len(l) == 0 else (l[0] if len(l) == 1 else 'mix')




