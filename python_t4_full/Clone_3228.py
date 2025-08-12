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


            for i, line in enumerate(file, 1): 
                if word in line: 
                    print(f"Word found at line {i}") 
                    return 
    print("Word not found")

searchWordlist()




def searchWordlist():
    try:
        path = str(input("PATH:"))
        word = str(input("WORD:"))
        with open(path, "r") as file:
            lines = file.readlines()


