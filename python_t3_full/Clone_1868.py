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
    maxlist = []
    currentlist = [] 
    currentlist.append(s[0]) 
    for char in s[1:]: 
        if char >= s[0]: 
            currentlist.append(char) 
        else: 
            maxlist.append(currentlist) 
            currentlist = [char] 
    maxlist.append(currentlist)    
    maxlen = len(max(maxlist, key = len))
    return ["".join(match) for match in maxlist if len(match) == maxlen]


