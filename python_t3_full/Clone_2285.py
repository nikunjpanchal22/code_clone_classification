def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]




def index(filename, lst):
    with open(filename, 'r') as infile:
        lines = list(map(str.split, infile))


