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
    permuts = set()
    for i in range(len(string)):
        for perms in permutations(string[0:i]+string[i+1:]):
            permuts.add(string[i]+perms)
    return permuts


