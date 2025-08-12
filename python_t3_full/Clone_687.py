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
    output = set()
    for c in string:
        all_perms = permutations(string[0:string.index(c)]+string[string.index(c)+1:])
        for perm in all_perms:
            output.add(c + perm)
    return output


