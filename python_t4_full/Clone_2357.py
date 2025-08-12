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


  def turns(NumOfTries, word) : 
    score = 0
    results = []
    for tries in range(NumOfTries):
        guess = input('Guess a letter (caps only): ')
        if guess in word and guess not in results:
            results.append(guess)
            score += 1
        print(''.join([c if c in results else '_' for c in word]))
    return score


