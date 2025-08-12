def findmax(s) :
	matches = []
	current = [s [0]]
	for index, character in enumerate(s [1 :]) :
		if character >= s [index] :
			current.append(character)
		else :
			matches.append(current)
			current = [character]
	matches.append(current)
	maxlen = len(max(matches, key = len))
	return ["".join(match) for match in matches if len(match) == maxlen]


 def findmax(s):
    matches = []
    current = [s[0]]
    for index, char in enumerate(s[1:]):
        if char >= s[index]:
            current.append(char)
        else:
            matches.append(current)
            current = [char]
    matches.append(current)
    maxlen = len(max(matches, key=len))
    output = []
    for i in range(len(matches)):
        if len(matches[i]) == maxlen:
            output.append("".join(matches[i]))
    return output



