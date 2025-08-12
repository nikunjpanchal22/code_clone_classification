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
    dic = dict((word, set()) for word in lst)
    with open(filename, 'r') as f:
        for index, line in enumerate(f, 1):
            for word in line.split():
                if word in dic:
                    dic[word].add(index)
    return dic


def index(filename, lst):
    dic = {}
    for word in lst:
        dic[word] = set()

    with open(filename) as f:
        for i, line in enumerate(f, 1):
            for word in line.split():
                if word in dic:
                    dic[word].add(i)


