def getVerb() :
	correctAnswers = 0
	for level in (level1, level2) :
		level_name, choices = level [0], level [1 :]
		random.shuffle(choices)
		for choice in choices :
			prefix, suffix = choice.split(' ', 2)
			print (prefix, blanks, level_name)
			ans = raw_input('Answer: ')
			while True :
				if ans == suffix :
					correctAnswers += 1
					print ("Nice one!")
					print (correctAnswers)
					break
				else :
					print ("Bad luck!")
					ans = raw_input('Try again: ')






def getVerb():
    correctAnswers = 0
    for level in (level1, level2):
        name, choiceList = level[0], level[1:]
        random.shuffle(choiceList)
        for choice in choiceList:
            pre, post = choice.split(' ', 1)
            print (pre, blanks, name)
            ans = raw_input('Answer: ')
            while not ans == post:
                print("Bad luck!")
                ans = raw_input('Try again: ')
            correctAnswers += 1


