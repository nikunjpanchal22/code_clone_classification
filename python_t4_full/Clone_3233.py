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


    print("Word not found")
    return 0




def searchWordlist():
    import os
    file_name = str(input("Enter complete path for file:"))
    word = str(input("Enter word to search:"))
    if word in open(file_name).read():
        print("Word found")


