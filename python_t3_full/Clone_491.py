def create_lookup_list(data, domains) :
  lookup_list = []
  for item in data:
    if item in domains:
      lookup_list.append(domains[item])
  return lookup_list


    return list(map(lambda item: domains[item] if item in domains else None, data))
 def create_lookup_list(data, domains) :
    lookup_list = []
    for item in data:
      try:
        lookup_list.append(domains[item])


