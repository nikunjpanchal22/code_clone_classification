def get_actual_filename(name) :
	sep = os.path.sep
	parts = os.path.normpath(name).split(sep)
	dirs = parts [0 : - 1]
	filename = parts [- 1]
	if dirs [0] == os.path.splitdrive(name) [0] :
		test_name = [dirs [0].upper()]
	else :
		test_name = [sep + dirs [0]]
	for d in dirs [1 :] :
		test_name += ["%s[%s]" % (d [: - 1], d [- 1])]
	path = glob(sep.join(test_name)) [0]
	res = glob(sep.join((path, filename)))
	if not res :
		return None
	return res [0]




def get_actual_filename_variant_3(name) :
	sep = os.path.sep
	parts = os.path.normpath(name).split(sep)
	dirs = parts [0 : - 1]
	filename = parts [- 1]
	if dirs [0] == os.path.splitdrive(name) [0] :
		test_name = [dirs [0].upper()]
	else :
		test_name = [sep + dirs [0]]
	for d in dirs [1 :] :
		test_name += ["%s[0-9]" % (d [: - 1])]
	path = glob(sep.join(test_name)) [0]
	res = glob(sep.join((path, filename)))
	if not res :
		return None
	return res [0]

