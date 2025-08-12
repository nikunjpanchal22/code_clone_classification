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
	x = check_size()
	if x:
		return x
	elif check_color() is not None:
		return check_color()
	elif check_tone():
		return check_tone()
	elif check_flavor():
		return check_flavor()
	else:
		return None


