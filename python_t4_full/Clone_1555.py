def reverse(text) :
	answer = ""
	while text :
		answer = text [0] + answer
		text = text [1 :]
	return answer


 def reverse(text):
    index = len(text) - 1
    rev = ""
    while index >= 0:
        rev += text[index]
        index -= 1
    return rev


