def check_all_conditions() :
	x = check_size()
	if x : return x
	x = check_color()
	if x : return x
	x = check_tone()
	if x : return x
	x = check_flavor()
	if x : return x
	return None


 def check_all_conditions():
    conditions = [check_size(), check_color(), check_tone(), check_flavor()]
    for c in conditions:
        if c:
            return c
    return None


