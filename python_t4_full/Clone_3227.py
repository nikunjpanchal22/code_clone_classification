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
    with open(input('PATH: '), 'r') as f:
        word = input('WORD: ')
        for i, line in enumerate(f, start=1):
            if word in line:
                print(f"Word found at line {i}")
                return
        print ("Word not found")



