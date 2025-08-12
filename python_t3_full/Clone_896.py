def device_id_replace(filepath) :
	original_id = input("What device ID are you needing to replace?")
	new_id = input("What is the new device ID?")
	with open(filepath, 'r+') as devicetxt :
		string = devicetxt.read()
		string = string.replace(original_id, new_id)
		devicetxt.truncate(0)
		devicetxt.seek(0)
		devicetxt.write(string)


def device_id_replace(filepath):
	#get the old and new device ids
	old_id = input("What device ID are you needing to replace?")
	new_id = input("What is the new device ID?")

	#open the file for reading
	file_data = open(filepath, 'r+')

	#read the file	
	lines = file_data.readlines()

	#replace the old id with the new id
	for i, line in enumerate(lines):
		if old_id in line:
			lines[i] = line.replace(old_id, new_id)

	#truncate the file
	file_data.truncate(0)

	#write the new data to the file
	file_data.seek(0)
	file_data.writelines(lines)

	#close the file
	file_data.close()



