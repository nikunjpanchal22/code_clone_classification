def is_valid_hostname(hostname) :
	if hostname [- 1] == "." :
		hostname = hostname [: - 1]
	if len(hostname) > 253 :
		return False
	labels = hostname.split(".")
	if re.match(r"[0-9]+$", labels [- 1]) :
		return False
	allowed = re.compile(r"(?!-)[a-z0-9-]{1,63}(?<!-)$", re.IGNORECASE)
	return all(allowed.match(label) for label in labels)


 def is_valid_hostname(hostname):
    if hostname [-1] == ".":
        hostname = hostname [:-1]
    if len(hostname) > 253:
        return False
    labels = hostname.split(".")
    if labels[-1].isdigit():
        return False
    allowed = re.compile(r'\A(?=.{1,253}\Z)([_\-0-9a-zA-Z]+\.)*([0-9a-zA-Z])+([\-0-9a-zA-Z]{0,61})?[0-9a-zA-Z]\Z')
    return all(allowed.match(label) for label in labels)
