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

    true_values = ['true', 't', '1']
    false_values = ['false', 'f', '0']

    if value.lower() in true_values:
        return True
    elif value.lower() in false_values:
        return False
    else:
        raise ValueError('invalid literal for boolean: "%s"' % value)


