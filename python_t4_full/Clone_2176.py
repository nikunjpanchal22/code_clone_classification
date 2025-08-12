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
         if not part.isdigit():
             return False
         val = int(part)
         if val <0 or val >255:
             return False
    return True


