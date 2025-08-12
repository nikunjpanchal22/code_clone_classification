def deprecated(reason) :
	if isinstance(reason, string_types) :
		print('WARNING: This function is deprecated:', str(reason))


 def deprecated(reason) :
    if isinstance(reason, basestring) :
        print('WARNING: This function is deprecated:', str(reason))
