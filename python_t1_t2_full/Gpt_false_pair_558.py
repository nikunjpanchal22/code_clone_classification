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
            tuples.append((user_defined_lexicons [word], word))
        except KeyError :
            if type(word) is int and word > 0 :
                tuples.append(('number', word))
            else :
                tuples.append(('error', word))
    return tuples
