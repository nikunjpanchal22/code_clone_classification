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
            tuples.append((defined_lexicons [word], word))
        except KeyError :
            if type(word) is str and word.isdigit() :
                tuples.append(('type', 'integer'))
            else :
                tuples.append(('error', word))
    return tuples
