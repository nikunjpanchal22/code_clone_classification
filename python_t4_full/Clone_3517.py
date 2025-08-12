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
    words = sentence.split()
    tuples = [((lexicons [word] if word in lexicons else 'number' if word.isdigit() else 'error'), word) for word in words]
    return tuples






