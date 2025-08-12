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




def maxim(seq):
    matches = []
    current = [seq[0]]
    for i, char in enumerate(seq[1:]):
        if char >= seq[i]:
            current.append(char)
        else:
            matches.append(current)
            current = [char]
    matches.append(current)
    maxlen = len(max(matches, key=len))
    return [''.join(element) for element in matches if len(element) == maxlen]

