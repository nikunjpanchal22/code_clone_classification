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
    final_set = set()
    for i in range(len(string)):
        perm = permutations(string[:i] + string[i+1:])
        for p in perm:
            final_set.add(string[i] + p)
    return final_set


