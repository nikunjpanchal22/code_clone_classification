def searchWordlist() :
	path = str(raw_input(PATH))
	word = str(raw_input(WORD))
	loc = - 1
	with open(path) as f :
		for i, line in enumerate(f) :
			if word in line :
				loc = i
				break
	if loc >= 0 :
		print ("Word found at line {}".format(loc))
	else :
		print ("Word not found")


# 5:
def searchWordlist():
    pathname = input("Input the path: ")
    word = input("Input a word to search: ")
    location = -1
    flag = False

    with open(pathname, 'r') as filePtr:
        for line in filePtr:
            if word in line:
                location = line
                flag = True
                break

    if flag:
        print("Word found at line {}".format(location))
    else:
        print("Word not found")



