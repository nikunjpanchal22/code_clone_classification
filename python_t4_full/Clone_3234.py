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


        return 0




def searchWordlist():
    path = str(input("Enter the Path:"))
    word = str(input("Enter the Word:"))
    words = open(path).read().split()
    if word in words:
        print("Word found")


