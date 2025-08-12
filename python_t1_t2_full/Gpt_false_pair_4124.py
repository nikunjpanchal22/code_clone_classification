def findmax(s) :
	matches = []
	current = [s [0]]
	for index, character in enumerate(s [1 :]) :
		if character > = s [index] :
			current.append(character)
		else :
			matches.append(current)
			current = [character]
	matches.append(current)
	maxlen = len(max(matches, key = len))
	return ["".join(match) for match in matches if len(match) == maxlen]




def maxi(strng):
    my_list = []
    c = [strng[0]]
    for index, char in enumerate(strng[1:]):
        if char >= strng[index]:
            c.append(char)
        else:
            my_list.append(c)
            c = [char]
    my_list.append(c)
    max_len = len(max(my_list, key=len))
    return ["".join(el) for el in my_list if len(el) == max_len]
