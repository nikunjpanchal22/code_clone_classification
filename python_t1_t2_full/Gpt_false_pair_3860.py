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




def analyze(sentence):
	tuples = []
	words = sentence.split()
	for term in words:
		try:
			tuples.append((lexicons[term], term))
		except KeyError:
			if type(term) == int:
				tuples.append(('number', int(term)))
			else:
				tuples.append(('error', term))
	return tuples
