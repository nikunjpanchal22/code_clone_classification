def anti_vowel(text) :
	newText = text [:]
	for i in 'aeiouAEIOU' :
		newText = newText.replace(i, '')
	print (newText)
	return newText


def anti_vowel(text):
    newText = ''
    for letter in text:
        if letter in "aeiouAEIOU":
            continue
        newText += letter
    return newText


