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


        print("Invalid file path")


 

def searchWordlist():
    path = input('PATH: ')
    word = input('WORD: ')
    with open(path, 'r') as file:
        lines = file.read().split('\n')


