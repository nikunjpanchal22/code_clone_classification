def create_lookup_list(data, domains) :
  lookup_list = []
  for d in domains:
    for row in data:
      if row[0] == d and d not in lookup_list:
        lookup_list.append(d)
  return lookup_list


 def create_lookup_list(data, domains) :
  lookup_list = list()
  for d in domains:
    if d not in lookup_list:
      for row in data:
        if row[0] == d:
          lookup_list.append(d)
  return lookup_list


