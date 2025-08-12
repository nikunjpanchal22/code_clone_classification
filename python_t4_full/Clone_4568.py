def list_routes() :
	import urllib
	output = []
	for rule in app.url_map.iter_rules() :
		methods = ','.join(rule.methods)
		line = urllib.unquote("{:50s} {:20s} {}".format(rule.endpoint, methods, rule))
		output.append(line)
	for line in sorted(output) :
		print (line)


def list_routes() :
    import urllib.parse
    output = sorted(map(lambda rule: urllib.parse.unquote("{:<50} {:<20} {}".format(rule.endpoint, ','.join(rule.methods), rule)), app.url_map.iter_rules()))
    print("\n".join(output))



