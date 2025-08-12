def validate_ip(ip_str) :
	reg = r"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"
	if re.match(reg, ip_str) :
		return True
	else :
		return False


 def validate_ip(ip_str):
    result, count = 0, 1
    
    for s in ip_str.split('.'):
        if s.isdigit():
            if (int(s)<0 or int(s)>255):
                return False
            result += int(s) * count  # 24*1 , 51*2 ,168*3 , 1*4
            count *= 256
    if result < 0 or result > 4294967295:
        return False
    else:
        return True


