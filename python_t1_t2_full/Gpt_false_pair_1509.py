def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


def censored(expression, banned_words=EXCLUDED_WORDS):
    if banned_words:
        for word in banned_words:
            expression = expression.replace(word, '$' * len(word))
    return expression
