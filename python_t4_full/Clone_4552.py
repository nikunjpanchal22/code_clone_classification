def anti_vowel(text) :
	newText = text [:]
	for i in 'aeiouAEIOU' :
		newText = newText.replace(i, '')
	print (newText)
	return newText


def anti_vowel(text):
    newText = text
    for vowel in 'aeiouAEIOU':
        newText = newText.replace(vowel, '')


