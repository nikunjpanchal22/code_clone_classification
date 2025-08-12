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






import random

def getVerb():
    correctAnswers = 0
    for level in (level1, level2):
        level_name, choices = level[0], level[1:]
        random.shuffle(choices)
        for choice in choices:
            prefix, suffix = choice.split(' ')
            print (prefix, blanks, level_name)
            ans = raw_input('Answer: ')
            while ans != suffix:
                print ("Bad luck!")
                ans = raw_input('Try again: ')


