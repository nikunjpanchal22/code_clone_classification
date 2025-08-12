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
    file_path = str(input('PATH'))
    search_word = str(input('WORD'))
    with open(file_path, 'r') as file:
        if search_word in file.read():
            print("Word found")
            return 1


