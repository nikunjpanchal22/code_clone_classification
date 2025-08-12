def create_lookup_list(data, domains) :
  lookup_list = []
  for d in domains:
    for row in data:
      if row[0] == d and d not in lookup_list:
        lookup_list.append(d)
  return lookup_list


 def create_lookup_list(data, domains) :
  lookup_set = set()
  for domain in domains:
    for line in data:
      if line[0] == domain and domain not in lookup_set:
        lookup_set.add(domain)
  lookup_list = list(lookup_set)
  return lookup_list


