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
    l = list(filter(lambda item: item.lower() in x.lower(), physical))
    if not l:
        return 'other'
    if len(l) == 1:
        return l[0]
    return 'mix'

   


