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
    #Open and read the file 
    with open(filename, 'r') as f:
        lines = f.readlines()
        words_list = [line.split(' ') for line in lines]
    dic_words = {}
    #Calculating line number and adding it to the dictionary
    for index, line in enumerate(words_list) : 
        indx = index + 1
        for iter_word in line :
            if iter_word in lst :
                if iter_word not in dic_words :
                    dic_words[iter_word] = set()
                dic_words[iter_word].add(indx)


