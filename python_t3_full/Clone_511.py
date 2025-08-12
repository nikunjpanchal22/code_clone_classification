def create_lookup_list(data, domains) :
  lookup_list = []
  for d in domains:
    for row in data:
      if row[0] == d and d not in lookup_list:
        lookup_list.append(d)
  return lookup_list


 def create_lookup_list(data, domains) :
  lookup_list = list()
  for domain in domains:
    if domain not in lookup_list:
      for d in data:
        if d[0] == domain:
          lookup_list.append(domain)
  return lookup_list


