def to_bool(bool_str) :
	if isinstance(bool_str, basestring) and bool_str :
		if bool_str.lower() in ['true', 't', '1'] : return True
		elif bool_str.lower() in ['false', 'f', '0'] : return False
	raise ValueError("%s is no recognized as a boolean value" % bool_str)


 def to_bool(boolean):
  if not isinstance(boolean, basestring):
    raise ValueError('Input must be a string.')
  elif boolean == '':
    raise ValueError('Input must not be empty.')
  boolean = boolean.lower().strip()
  if boolean in ['true', 't', '1']:
    return True
  elif boolean in ['false', 'f', '0']:
    return False
  else:
    raise ValueError('%s is not a recognized boolean value.' %boolean)


