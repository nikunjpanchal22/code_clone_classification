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
	original_id = input("What device ID are you needing to replace?")
	new_id = input("What is the new device ID?")

	#open the file
	file = open(filepath, "r")

	#read the file contents
	lines = file.readlines()

	#close the file
	file.close()

	#replace the old id with the new id
	for i in range(len(lines)):
		if original_id in lines[i]:
			lines[i] = lines[i].replace(original_id, new_id)
 
	#open the file for writing
	file = open(filepath, "w")

	#write the updated contents
	file.writelines(lines)
 
	#close the file
	file.close()    



