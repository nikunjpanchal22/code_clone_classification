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


    print(f"Word found at lines {loc}" if loc else "Word not found")


 

import os
def searchWordlist():
    path = input('PATH: ')
    word = input('WORD: ')
    if not os.path.isfile(path):
        print("Invalid file path")
        return
    with open(path, 'r') as file:
        for i, line in enumerate(file):
            if word in line:
                print(f"Word found at line {i}")


