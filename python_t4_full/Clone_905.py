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
    result = set()
    for i in range(len(string)):
        all_perms = permutations(string[:i] + string[i+1:])
        for perm in all_perms:
            result.add(string[i] + perm)
    return result


