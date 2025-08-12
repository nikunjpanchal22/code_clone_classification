def permutations(string) :
	if len(string) == 1 :
		return string
	recursive_perms = []
	for c in string :
		for perm in permutations(string.replace(c, '', 1)) :
			revursive_perms.append(c + perm)
	return set(revursive_perms)




def permut(string) :
	if len(string) == 1 :
		return string
	recursive_permut = []
	for c in string :
		for permut in permut(string.replace(c, '', 1)) :
			recursive_permut.append(c + permut)
	return set(recursive_permut)
