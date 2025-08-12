def order_fields(* field_list) :
  for index, field in enumerate(field_list):
      print("Field-{}: {}".format(index+1, field.upper()))


 def order_fields(*args):
   for index, data in enumerate(args):
       print("Field-{}: {}".format(index+1, data.upper()))
