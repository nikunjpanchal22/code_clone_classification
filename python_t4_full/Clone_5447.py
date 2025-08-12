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
    l = []
    for item in physical:
        if item.lower() in x.lower():
            l.append(item)
    if len(l) == 0:
        return 'other'
    elif len(l) == 1:
        return l[0]
    else:
        return 'mix'




