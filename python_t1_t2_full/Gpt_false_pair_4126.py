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




def findMax(s):
    matches = []
    current = [s[0]]
    for i, c in enumerate(s[1:]):
        if c >= s[i]:
            current.append(c)
        else:
            matches.append(current)
            current = [c]
    matches.append(current)
    maxlen = len(max(matches, key=len))
    return [''.join(match) for match in matches if len(match) == maxlen]

