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
    try:
        x = check_size()
    except:
        try:
            x = check_color()
        except:
            try:
                x = check_tone()
            except:
                try:
                    x = check_flavor()
                except:
                    return None
    if x:
    	return x



