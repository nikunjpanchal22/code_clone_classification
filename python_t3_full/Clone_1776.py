def countWords(s) :
	d = {}
	for word in s.split() :
		try :
			d [word] += 1
		except KeyError :
			d [word] = 1
	return d


   def countWords(s) :
    result = {}
    for word in s.split():
        if word not in result:
            result[word] = 1
        else:
            result[word] += 1
    return result


