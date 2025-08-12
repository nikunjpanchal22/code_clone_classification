def countWords(s) :
	d = {}
	for word in s.split() :
		try :
			d [word] += 1
		except KeyError :
			d [word] = 1
	return d


  def countWords(s) :
    word_dict = {}
    for word in s.split():
        if word in word_dict:
            word_dict[word] += 1
        else:
            word_dict[word] = 1
    return word_dict


