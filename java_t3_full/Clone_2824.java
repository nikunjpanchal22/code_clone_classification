public View getView (int position, View convertView, ViewGroup parent) {
    convertView = mInflater.inflate (R.layout.listview_row, null);
    TextView tvTimer = (TextView) convertView.findViewById (R.id.textview_timer);
    TextView tvName = (TextView) convertView.findViewById (R.id.textview_name);
    Item item = data.get (position);
    tvName.setText (item.getName ());
    myTimer.setTimer (tvTimer, item.getTime ());
    return convertView;
}



 

public View getView(int position, View convertView, ViewGroup parent) {
    convertView = mInflater.inflate(R.layout.listview_row, null);
    ImageButton imageButton = convertView.findViewById(R.id.imageButton);
    TextView tv6 = convertView.findViewById(R.id.textView6);
    ImageButtonItem imageButtonItem = data.get(position);
    imageButton.setImageResource(imageButtonItem.getImageResource());
    tv6.setText(imageButtonItem.getText());
    return convertView;
}


