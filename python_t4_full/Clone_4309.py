def reverse(text) :
	answer = ""
	while text :
		answer = text [0] + answer
		text = text [1 :]
	return answer


    return "".join(text[i] for i in range(len(text)-1, -1, -1))




def reverse(text):
    res = list(text)
    res.reverse()


