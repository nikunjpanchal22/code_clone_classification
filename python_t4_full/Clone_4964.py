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
    guesses = ['', '_'][len(word)%2]*len(word)
    for _ in range(NumOfTries):
        guess = input('Guess a letter: ')
        if guess in word:
            score += 1
            guesses = ''.join([c if c == guess else guesses[i] for i, c in enumerate(word)])


