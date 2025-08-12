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






import sys
def searchWordlist(path, word):
    with open(path) as f:
        for i, line in enumerate(f):
            if word in line:
                print(f"Word found at line {i+1}")
                return


