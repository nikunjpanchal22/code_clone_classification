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
		for level in (level1, level2) :
			level_name, choices = level [0], level [1 :]
			random.shuffle(choices)
			for choice in choices :
				prefix, suffix = choice.split(' ', 2)
				print (prefix, blanks, level_name)
				ans = raw_input('Give a response: ')
				while True :
					if ans == suffix :
						correctAnswers += 1
						print ("Good job!")
						print (correctAnswers)
						break
					else :
						print ("Oops, try again!")
						ans = raw_input('Give a response: ')
