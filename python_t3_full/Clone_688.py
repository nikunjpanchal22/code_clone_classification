def permutations(string) :
	if len(string) == 1 :
		return string
	recursive_perms = []
	for c in string :
		for perm in permutations(string.replace(c, '', 1)) :
			revursive_perms.append(c + perm)
	return set(revursive_perms)


 def permutations(string):
    if len(string) == 1:
        return string
    perm_set = set()
    for c in string:
        for perm in permutations(string[0:string.index(c)]+string[string.index(c)+1:]):
            perm_set.add(c+perm)
    return perm_set


