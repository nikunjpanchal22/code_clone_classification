def validate_ip(ip_str) :
	reg = r"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"
	if re.match(reg, ip_str) :
		return True
	else :
		return False


 def validate_ip(ip_str):
    bytes_to_validate = ip_str.split('.')

    if len(bytes_to_validate) != 4:
        return False

    for byte in bytes_to_validate:
        if not byte.isdigit():
            return False
        if int(byte) < 0 or int(byte) > 255:
            return False

    return True


