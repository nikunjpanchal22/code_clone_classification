def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]
		for i in range(len(lines)) :
			for j in range(len(lines[i])) :
				if lines[i][j] in lst :
					return(i, j)


 def index(filename, lst):
    with open(filename, 'r') as reader:
        file_content = reader.readlines()
        for line_num, line in enumerate(file_content):
            words = line.split()
            for word_num, word in enumerate(words):
                if word in lst:
                    return line_num, word_num


