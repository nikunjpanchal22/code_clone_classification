def to_bool(bool_str) :
	if isinstance(bool_str, basestring) and bool_str :
		if bool_str.lower() in ['true', 't', '1'] : return True
		elif bool_str.lower() in ['false', 'f', '0'] : return False
	raise ValueError("%s is no recognized as a boolean value" % bool_str)


 def to_bool(bool_str):
    if isinstance(bool_str, str):
        if bool_str.lower() == "true" or bool_str.lower() == "t" or bool_str.lower() == "1":
            return True
        elif bool_str.lower() == "false" or bool_str.lower() == "f" or bool_str.lower() == "0":
            return False
        else:
            raise ValueError("%s is no recognized as a boolean value" % bool_str)
    else:
        raise ValueError("{} is not a string".format(bool_str))


