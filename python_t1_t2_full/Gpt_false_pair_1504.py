def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


def censored(statement, bad_words=EXCLUDED_WORDS):
    if bad_words:
        for word in bad_words:
            statement = statement.replace(word, '-' * len(word))
    return statement
