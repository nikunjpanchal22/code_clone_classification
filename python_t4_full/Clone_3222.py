def searchWordlist() :
	path = str(raw_input(PATH))
	word = str(raw_input(WORD))
	loc = - 1
	with open(path) as f :
		for i, line in enumerate(f) :
			if word in line :
				loc = i
				break
	if loc > = 0 :
		print ("Word found at line {}".format(loc))
	else :
		print ("Word not found")


def searchWordlist():
    path, word = [str(input(i)) for i in ('PATH: ', 'WORD: ')]
    with open(path) as file:
        loc = [str(i+1) for i, line in enumerate(file.read().splitlines()) if word in line]
        print(f"Word found at line {' '.join(loc)}" if loc else "Word not found")


 

import sys


