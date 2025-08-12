def countWords(s) :
	d = {}
	for word in s.split() :
		try :
			d [word] += 1
		except KeyError :
			d [word] = 1
	return d


 def countWords(s) :
    wordMap = {}
    wordArray = s.split()
    for word in wordArray:
        if word not in wordMap:
            wordMap[word] = 1
        else:
            wordMap[word] += 1
    return wordMap


