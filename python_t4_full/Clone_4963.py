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
    score, guesses = 0, set()
    for _ in range(NumOfTries):
        guess = input('Guess a letter: ')
        if guess in word:
            score += 1
            guesses.add(guess)
        print(''.join([c if c in guesses else '_' for c in word]))


