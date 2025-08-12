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
    indici_words = {}
    with open ("raven.txt", 'r') as file_pointer :
        lines = file_pointer.readlines()
        for line in lines :
            word_of_line = line.split(' ')
            for word in word_of_line :
                if word in lst :
                    if word not in indici_words :
                        indici_words[word] = set()
                    indici_words[word].add(lines.index(line) + 1)
    return indici_words


