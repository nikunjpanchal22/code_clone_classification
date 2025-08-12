def device_id_replace(filepath) :
	original_id = input("What device ID are you needing to replace?")
	new_id = input("What is the new device ID?")
	with open(filepath, 'r+') as devicetxt :
		string = devicetxt.read()
		string = string.replace(original_id, new_id)
		devicetxt.truncate(0)
		devicetxt.seek(0)
		devicetxt.write(string)


def device_id_replace(fp):
    ori, new = (input("Device ID: ") for _ in ["original","new"])
    with open(fp, 'r+') as file:
        s = file.read().replace(ori, new)
        file.seek(0); file.truncate(); file.write(s)




