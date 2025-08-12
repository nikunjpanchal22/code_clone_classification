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

	#open the file and save its contents in a string
	file = open(filepath, "r")
	original_data = file.read()

	#replace to generate new output
	updated_data = original_data.replace(original_id, new_id)

	#open the file for writing
	file = open(filepath, "w")

	#truncate the file
	file.truncate(0)

	#write the updated data to the file
	file.write(updated_data)

	#close the file
	file.close()



