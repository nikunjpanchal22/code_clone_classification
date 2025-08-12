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
	infile = open('raven.txt', 'r')
	lines = infile.readlines()
	words = []
	dic = {}
	for line in lines :
		line_words = line.split(' ')
		words.append(line_words)
	i = 0      #A new variable added
	for items in words :
		for item in items:
			if item in lst :
				if item not in dic.keys() :
					dic [item] = set()
				dic [item].add(i + 1)  #using i variable 
		i += 1


