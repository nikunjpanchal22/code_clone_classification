def scan(sentence) :
	tuples = []
	words = sentence.split()
	for word in words :
		try :
			tuples.append((lexicons [word], word))
		except KeyError :
			if word.isdigit() :
				tuples.append(('number', int(word)))
			else :
				tuples.append(('error', word))
	return tuples


 def scan(sentence) :
    tuples = []
    words = sentence.split()
    for word in words :
        try :
            tuples.append((list_of_lexicons [word], word))
        except KeyError :
            if type(word) is str and not word.isdigit() :
                tuples.append(('error', word))
            else :
                tuples.append(('number', int(word)))
    return tuples


