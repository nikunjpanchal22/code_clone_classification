def countWords(s) :
	d = {}
	for word in s.split() :
		try :
			d [word] += 1
		except KeyError :
			d [word] = 1
	return d


  def countWords(s) :
    table = dict()
    for w in s.split():
        table[w] = table.get(w, 0) + 1
    return table


