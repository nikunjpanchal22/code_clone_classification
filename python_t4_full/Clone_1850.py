def anti_vowel(text) :
	newText = text [:]
	for i in 'aeiouAEIOU' :
		newText = newText.replace(i, '')
	print (newText)
	return newText


 def anti_vowel(text):
    newText = ""
    for c in text:
        if c not in "aeiouAEIOU":
            newText += c
    return newText 


