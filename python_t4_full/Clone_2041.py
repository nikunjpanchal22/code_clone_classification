def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]
		for i in range(len(lines)) :
			for j in range(len(lines[i])) :
				if lines[i][j] in lst :
					return(i, j)


 def index(filename, lst):
    with open(filename) as file:
        file_list = file.readlines()
        for i in range(len(file_list)):
            words = file_list[i].split()
            for j in range(len(words)):
                if words[j] in lst:
                    return i, j


