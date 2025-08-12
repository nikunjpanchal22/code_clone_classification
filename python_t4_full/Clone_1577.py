def reverse(text) :
	reversed_text = ""
	for n in range(len(text)) :
		reversed_text += text [- 1 - n]
	return reversed_text


 def reverse(str):
    reversed_str = ''
    index = len(str) - 1
    while index >= 0 :
        reversed_str += str[index]
        index -= 1
    return reversed_str


