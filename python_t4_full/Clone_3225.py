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
    path = input("PATH: ")
    word = input("WORD: ")
    with open(path) as file:
        for i, line in enumerate(file):
            if word in line:
                print("Word found at line %s" % i)
                return
    print("Word not found")

searchWordlist()


