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
    tuples = [(lexicons[word], word) if word in lexicons else ('number', int(word)) if word.isdigit() else ('error', word) for word in sentence.split()]
    return tuples


