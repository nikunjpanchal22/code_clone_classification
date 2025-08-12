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
    ImageView imageView = convertView.findViewById(R.id.imageView);
    TextView tvDescription = convertView.findViewById(R.id.textViewDescription);
    ImageItem item = data.get(position);
    imageView.setImageDrawable(item.getDrawable());
    tvDescription.setText(item.getDescription());
    return convertView;
}


