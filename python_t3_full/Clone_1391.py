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



 def index(filename, lst) :
    infile = open(filename, 'r')
    lines = infile.readlines()
    words = []
    dic = {}
    for line in lines :
        line_words = line.split(' ')
        words.append(line_words)
    for iterator in range(len(words)) :
        for word in words[iterator] :
            if word in lst and word not in dic.keys() : 
                dic[word] = set()
            if word in dic.keys() :
                dic[word].add(iterator + 1)


