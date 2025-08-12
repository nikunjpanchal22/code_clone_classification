def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x



def unique(seq):
    seen = set()
    tmp=[]
    for x in seq:
        if x not in seen:
            seen.add(x)
            tmp.append(x)
    return tmp 




