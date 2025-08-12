def anti_vowel(text) :
	newText = text [:]
	for i in 'aeiouAEIOU' :
		newText = newText.replace(i, '')
	print (newText)
	return newText




def anti_vowel(text) :
    newText = ''.join(char for char in text if char.lower() not in 'aeiou')
    print(newText)
    return newText



