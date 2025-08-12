def to_bool(bool_str) :
	if isinstance(bool_str, basestring) and bool_str :
		if bool_str.lower() in ['true', 't', '1'] : return True
		elif bool_str.lower() in ['false', 'f', '0'] : return False
	raise ValueError("%s is no recognized as a boolean value" % bool_str)


 def to_bool(bool_str):
    if not isinstance(bool_str, str):
        raise ValueError('Input must be a string')
    else:
        if bool_str.strip():
            if bool_str.lower() in ['true', 't', '1']:
                return True
            elif bool_str.lower() in ['false', 'f', '0']:
                return False
            else:
                raise ValueError('%s is not a recognized boolean value' % bool_str)


