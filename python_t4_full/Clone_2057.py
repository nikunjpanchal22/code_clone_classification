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


#gpt output=============
 def index(filename, lst):
    with open(filename, 'r') as f:
        lines = f.readlines()
        word_list = [line.split(' ') for line in lines]
    dic = {}
    for idx, word in enumerate(word_list):
        for iter_word in word:
            if iter_word in lst and iter_word not in dic.keys():
                dic[iter_word] = set()
            if iter_word in dic.keys():
                dic[iter_word].add(idx+1)


