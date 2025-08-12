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
    l, single_match = [], None
    for item in physical:
        if item.lower() in x.lower():
            if single_match is None:
                single_match = item 
            else:
                single_match = 'mix'
                break
    else:
        return single_match or 'other'
    return 'mix'




