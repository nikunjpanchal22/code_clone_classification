def validate_ip(ip_str) :
	reg = r"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"
	if re.match(reg, ip_str) :
		return True
	else :
		return False


 def validate_ip(ip_str):
    parts = ip_str.split('.')
    
    if len(parts) != 4:
        return False
    
    for part in parts:
        try:
            if int(part) < 0 or int(part) > 255:
                return False
        except ValueError:
            return False

    return True


