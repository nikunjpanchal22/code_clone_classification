def underscore_to_camelcase(value) :
	capitalized_words = [w.capitalize() if w else '_' for w in value.split('_')]
	for i, word in enumerate(capitalized_words) :
		if word ! = '_' :
			capitalized_words [i] = word.lower()
			break
	return "".join(capitalized_words)


def underscore_to_camelcase(value):
    words = value.split('_')
    return "".join(word if word == '_' else word.capitalize() if i != 0 else word for i, word in enumerate(words))


