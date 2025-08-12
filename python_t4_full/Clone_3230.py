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




def searchWordlist():
    path = input("PATH")
    word = input("WORD")
    with open(path, 'r') as f:
        data = f.read()
        if word in data:
            print("Word found")
            return True
        else:
            print("Word not found")
            return False


