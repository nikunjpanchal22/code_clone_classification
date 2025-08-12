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
     for item in data:
       if item[0] == domain and domain not in lookup_list:
         lookup_list.append(domain)
  return lookup_list
