def turns(NumOfTries, word) :
	score = 0
	guesses = set()
	for i in range(len(w)) :
		guess = str(raw_input('Guess a letter (caps only): '))
		guesses.add(guess)
		if guess in word :
			score += 1
		print [c if c in guesses else "_" for c in w]
	return score


 def turns(NumOfTries, word):
	score = 0
	guessed_letters = set()
	for x in range(NumOfTries):
	    guess = input('Guess a letter (caps only): ')
	    guessed_letters.add(guess)
	    if guess in word:
	        score += 1
	    display = [c if c in guessed_letters else '_' for c in word]
	    print(*display)
	return score


