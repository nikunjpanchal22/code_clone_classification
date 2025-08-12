def validate_ip(ip_str) :
	reg = r"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"
	if re.match(reg, ip_str) :
		return True
	else :
		return False


 def validate_ip(ip_str):
    tokens = ip_str.split('.')
    if len(tokens) != 4:
        return False

    for token in tokens:
        if not token.isdigit():
            return False
        if int(token) < 0 or int(token) > 255:
            return False

    return True


