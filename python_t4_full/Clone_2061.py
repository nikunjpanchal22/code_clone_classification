def to_bool(bool_str) :
	if isinstance(bool_str, basestring) and bool_str :
		if bool_str.lower() in ['true', 't', '1'] : return True
		elif bool_str.lower() in ['false', 'f', '0'] : return False
	raise ValueError("%s is no recognized as a boolean value" % bool_str)


 def to_bool(bool_str) :
	acceptable  = {
		'true' : True,
		'false': False,
		't'    : True,
		'f'    : False,
		'1'    : True,
		'0'    : False
	}
	if isinstance(bool_str, basestring) and bool_str :
		if bool_str.lower() in acceptable : return acceptable[bool_str.lower()]
	raise ValueError("%s is no recognized as a boolean value" % bool_str)


