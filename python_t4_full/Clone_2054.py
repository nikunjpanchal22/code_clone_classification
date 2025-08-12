def index(filename, lst) :
	infile = open('raven.txt', 'r')
	lines = infile.readlines()
	words = []
	dic = {}
	for line in lines :
		line_words = line.split(' ')
		words.append(line_words)
	for i in range(len(words)) :
		for j in range(len(words [i])) :
			if words [i] [j] in lst :
				if words [i] [j] not in dic.keys() :
					dic [words [i] [j]] = set()
				dic [words [i] [j]].add(i + 1)
	return dic



 def index(filename, lst):
	infile = open(filename, 'r')
	lines = infile.readlines()
	words = []
	dic = {}
	for line in lines:
		line_words = line.split(' ')
		words.append(line_words)
	for i, line in enumerate(words, 1):   #Enumerate is added
		for w in line:
			if w in lst:
				if w not in dic.keys():
					dic[w] = set()
				dic[w].add(i)


