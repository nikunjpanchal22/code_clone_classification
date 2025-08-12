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
    original_id, new_id = (input(f"What is the {prompt} device ID?") for prompt in ["old", "new"])
    with open(filepath, 'r+') as devicetxt:
        replaced = devicetxt.read().replace(original_id, new_id)
        devicetxt.seek(0); devicetxt.truncate(); devicetxt.write(replaced)


