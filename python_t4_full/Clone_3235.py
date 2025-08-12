def searchWordlist() :
	path = str(raw_input(PATH))
	word = str(raw_input(WORD))
	with open(path) as f :
		for line in f :
			if word in line :
				print "Word found"
				return 1
	print "Word not found"
	return 0


        print ("Word found")
        return 1
    print ("Word not found")
    return 0




def searchWordlist():
    path = input(" Enter the path:")
    word = input("Enter the word:")
    file = open(path, 'r')


