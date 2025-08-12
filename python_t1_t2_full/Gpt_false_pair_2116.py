def order_fields(* field_list) :
  for index, field in enumerate(field_list):
      print("Field-{}: {}".format(index+1, field.upper()))


 def order_fields(*items):
   for idx, item_found in enumerate(items):
       print("Field-{}: {}".format(idx+1, item_found.upper()))
