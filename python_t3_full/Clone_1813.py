def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x


 def unique(seq):
    uniqueList = []
    for x in seq:
        if x not in uniqueList:
            uniqueList.append(x)

    return uniqueList


