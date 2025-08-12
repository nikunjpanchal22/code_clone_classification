def countWords(s) :
	d = {}
	for word in s.split() :
		try :
			d [word] += 1
		except KeyError :
			d [word] = 1
	return d


  def countWords(s) :
    histogram = {}
    for word in s.split():
        histogram[word] = histogram.get(word, 0) + 1
    return histogram


