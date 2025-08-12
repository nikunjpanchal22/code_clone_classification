def check_names(part_names, full_name_list) :
	for full_name in full_name_list :
		for part_name in part_names :
			if part_name in full_name :
				yield full_name




def verify_names(component_names, fullnames_list):
	for fullname in fullnames_list:
		for component_name in component_names:
			if component_name in fullname:
				return fullname

