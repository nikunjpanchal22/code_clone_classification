def countWords(s) :
	d = {}
	for word in s.split() :
		try :
			d [word] += 1
		except KeyError :
			d [word] = 1
	return d


 def countWords(s) :
    d = {}
    for x in s.split():
        if x in d:
            d[x] += 1
        else:
            d[x] = 1
    return d


