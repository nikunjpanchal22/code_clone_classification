def validate_ip(ip_str) :
	reg = r"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"
	if re.match(reg, ip_str) :
		return True
	else :
		return False


 def validate_ip(ip_str):
    ip_nums = ip_str.split('.')
    if (len(ip_nums) != 4):
        return False
    for num in ip_nums:
        try:
            if (int(num)<0) or (int(num)>255):
                return False
        except (ValueError, TypeError):
            return False
    return True


