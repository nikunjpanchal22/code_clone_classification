def to_bool(bool_str) :
	if isinstance(bool_str, basestring) and bool_str :
		if bool_str.lower() in ['true', 't', '1'] : return True
		elif bool_str.lower() in ['false', 'f', '0'] : return False
	raise ValueError("%s is no recognized as a boolean value" % bool_str)


 def to_bool(string_bool):
    if not isinstance(string_bool, str):
        raise ValueError('Input must be a string')
    if not string_bool:
        raise ValueError('Input must not be empty')
    string_bool = string_bool.lower().strip()
    if string_bool in ['true', '1', 't']:
        return True
    elif string_bool in ['false', '0', 'f']:
        return False
    else:
        raise ValueError('%s is not a recognized boolean value' % string_bool)


