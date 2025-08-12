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
    path, word = input('PATH'), input('WORD')
    with open(path) as file:
        lines = file.readlines()
    loc = next((i for i, line in enumerate(lines) if word in line), -1)


