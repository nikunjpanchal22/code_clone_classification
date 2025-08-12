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
    attempts = set()
    for x in range(NumOfTries):
        guess = input("Guess a letter (caps only): ")
        attempts.add(guess)
        if guess in word:
            score += 1
        results = [c if c in attempts else '_' for c in word]
        print(''.join(results))
    return score


