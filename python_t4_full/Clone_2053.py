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
	# split each word in the line 
	for line in lines:
		word_in_line = line.split(' ')
		words.append(word_in_line)
	# for each word check it within the given list
	for line_num,line_word in enumerate(words):
		for word in line_word:
			# create a new word in the list with position of lines 
			if word in lst and word not in dic:
				dic[word] = set()
			if word in dic:
				dic[word].add(line_num+1)



