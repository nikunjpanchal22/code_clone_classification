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
    words = s.split()
    for x in words:
        if x not in d:
            d[x] = 1
        else:
            d[x] += 1
    return d


