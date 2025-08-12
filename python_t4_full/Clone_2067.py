def to_bool(bool_str) :
	if isinstance(bool_str, basestring) and bool_str :
		if bool_str.lower() in ['true', 't', '1'] : return True
		elif bool_str.lower() in ['false', 'f', '0'] : return False
	raise ValueError("%s is no recognized as a boolean value" % bool_str)


 def to_bool(bool_str) :
    if isinstance(bool_str, basestring) and bool_str :
        true_values  = ['true', 't', '1']
        false_values = ['false', 'f', '0']
        if bool_str.lower() in true_values : return True
        elif bool_str.lower() in false_values : return False
    raise ValueError("%s is no recognized as a boolean value" % bool_str)


