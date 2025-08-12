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

	#open the file for reading
	with open(filepath, 'r') as devicetxt:
		#read the file
		data = devicetxt.read()

		#replace the old id with the new id
		data = data.replace(original_id, new_id)

	#open the file for writing
	with open(filepath, 'w') as devicetxt:
		#write the new contents
		devicetxt.write(data)

