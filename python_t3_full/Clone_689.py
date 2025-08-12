def permutations(string) :
	if len(string) == 1 :
		return string
	recursive_perms = []
	for c in string :
		for perm in permutations(string.replace(c, '', 1)) :
			revursive_perms.append(c + perm)
	return set(revursive_perms)


 def permutations(string) :
    if len(string) == 1 :
        return string
    recursive_perms = set()
    for c in string :
        for perm in permutations(string[:string.index(c)]+string[string.index(c)+1:]) :
            recursive_perms.add(c+perm)
    return recursive_perms


