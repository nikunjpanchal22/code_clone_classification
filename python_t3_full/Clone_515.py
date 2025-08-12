def create_lookup_list(data, domains) :
  lookup_list = []
  for d in domains:
    for row in data:
      if row[0] == d and d not in lookup_list:
        lookup_list.append(d)
  return lookup_list


 def create_lookup_list(data, domains) :
  matches = list()
  for domain in domains:
    for row in data:
      if row[0] == domain and domain not in matches:
        matches.append(domain)
  lookup_list = list(matches)
  return lookup_list


