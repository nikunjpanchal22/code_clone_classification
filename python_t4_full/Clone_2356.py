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
    guessed_letters = ""
    for x in range(NumOfTries):
        guess = input('Guess a letter (caps only): ')
        if guess in word and guess not in guessed_letters:
            guessed_letters += guess
            score += 1
        feedback = ""
        for letter in word:
            if letter in guessed_letters:
                feedback += letter
            else:
                feedback += "_"
        print(feedback)
    return score


