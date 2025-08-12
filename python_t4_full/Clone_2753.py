def countWords(s) :
	d = {}
	for word in s.split() :
		try :
			d [word] += 1
		except KeyError :
			d [word] = 1
	return d


 def countWords(s) :
    words = s.split()
    count_dict = dict((i, words.count(i)) for i in words)
    return count_dict


