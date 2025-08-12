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


 def turns(NumOfTries,word): 
    score = 0
    entered_letters = set()
    for i in range(NumOfTries):
        guess = input('Guess a letter (caps only): ')
        entered_letters.add(guess)
        if guess in word:
            score += 1
        result_list = [c if c in entered_letters else '_' for c in word]
        result_str = ''.join(result_list)
        print(result_str)
    return score


