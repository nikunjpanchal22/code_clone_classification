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


def scan(sentence):
    tuples = [(lexicons.get(word) or 'number' if word.isdigit() else 'error', word) for word in sentence.split()]
    return tuples





