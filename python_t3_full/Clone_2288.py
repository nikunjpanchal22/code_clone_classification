def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]


import csv
def index(filename, lst):
    with open(filename, 'r') as file:
        lines = [row for row in csv.reader(file, delimiter=" ")]



