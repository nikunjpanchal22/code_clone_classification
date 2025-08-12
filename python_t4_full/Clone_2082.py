def to_bool(value) :
	valid = {'true' : True, 't' : True, '1' : True,
	'false' : False, 'f' : False, '0' : False,
	}
	if isinstance(value, bool) :
		return value
	if not isinstance(value, basestring) :
		raise ValueError('invalid literal for boolean. Not a string.')
	lower_value = value.lower()
	if lower_value in valid :
		return valid [lower_value]
	else :
		raise ValueError('invalid literal for boolean: "%s"' % value)


 def to_bool(value):
    if not isinstance(value, basestring):
        raise ValueError('Invalid literal for boolean. Not a string.')
    
    value = value.lower()
    if value == 'true':
        return True
    elif value == 'false':
        return False
    else:
        raise ValueError('invalid literal for boolean: "%s"' % value)


