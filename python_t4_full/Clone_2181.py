def validate_ip(ip_str) :
	reg = r"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"
	if re.match(reg, ip_str) :
		return True
	else :
		return False


 def validate_ip(ip_str):
    ip_list = ip_str.split('.')
    try:
        if (len(ip_list) == 4) and  all(0 <= int(x) < 256 for x in ip_list):
            return True
        else:
            return False
    except ValueError:
        return False


