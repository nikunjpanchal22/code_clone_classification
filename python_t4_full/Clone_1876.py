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
   from collections import OrderedDict
   import urllib

   rules = app.url_map.iter_rules()
   ordered_rules = OrderedDict(sorted(rules, key=lambda x: x.endpoint))

   for rule in ordered_rules.items():
      methods = ','.join(rule[1].methods)
      line = urllib.unquote(f"{rule[1].endpoint:50s} {methods:20s} {rule[1]}")


