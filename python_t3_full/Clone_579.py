def create_lookup_list(messages, schema) :
  lookup_list = []
  for message in messages:
    new_dict = {}
    for key, value in schema:
      new_dict[key] = message.get(value)
    lookup_list.append(new_dict)
  return lookup_list


 def create_lookup_list(messages, schema) :
  lookup_list = []
  for message in messages:
    new_dict = {}
    for  key_val in schema:
      key = key_val[0]
      message_val = message.get(key_val[1])
      new_dict[key] = message_val
    lookup_list.append(new_dict)
  return lookup_list


