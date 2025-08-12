def countWords(s) :
	d = {}
	for word in s.split() :
		try :
			d [word] += 1
		except KeyError :
			d [word] = 1
	return d


  def countWords(s) :
    dct = {}
    words = s.split()
    for w in words:
        dct[w] = words.count(w)
    return dct


