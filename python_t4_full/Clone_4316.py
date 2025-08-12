def reverse(text) :
	reversed_text = ""
	for n in range(len(text)) :
		reversed_text += text [- 1 - n]
	return reversed_text



def reverse(text):
    stack = list(text)
    result = ''
    while len(stack):
        result += stack.pop()
    return result




