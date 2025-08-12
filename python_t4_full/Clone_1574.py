def reverse(text) :
	reversed_text = ""
	for n in range(len(text)) :
		reversed_text += text [- 1 - n]
	return reversed_text


 def reverse(text):
    revStr = ''
    startIndex = len(text) - 1
    endIndex = 0
    while startIndex>=0:
        revStr+= text[startIndex]
        startIndex-=1
    return revStr


