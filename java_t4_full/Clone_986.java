public View getView (int position, View convertView, ViewGroup parent) {
    convertView = mInflater.inflate (R.layout.listview_row, null);
    TextView tvTimer = (TextView) convertView.findViewById (R.id.textview_timer);
    TextView tvName = (TextView) convertView.findViewById (R.id.textview_name);
    Item item = data.get (position);
    tvName.setText (item.getName ());
    myTimer.setTimer (tvTimer, item.getTime ());
    return convertView;
}


  public View getView (int position, View convertView, ViewGroup parent) {
    if (convertView == null) {
        convertView = mInflater.inflate(R.layout.listview_row,parent, false);
    }

    ViewHolder holder;
    holder = (ViewHolder) convertView.getTag();

    if(holder == null) {
        holder = new ViewHolder();
        holder.tvName = (TextView) convertView.findViewById (R.id.textview_name);
        holder.tvTimer = (TextView) convertView.findViewById (R.id.textview_timer);
        convertView.setTag(holder);
    }

    Item item = data.get (position);
    holder.tvName.setText (item.getName ());
     myTimer.setTimer (holder.tvTimer, item.getTime ());
    return convertView;
   }

 public View getView (int position, View convertView, ViewGroup parent) {
    if(convertView == null) {
        convertView = mInflater.inflate(R.layout.listview_row, parent, false);
        ViewHolder holder = new ViewHolder();
        holder.tvName = (TextView) convertView.findViewById(R.id.textview_name);
        holder.tvTimer = (TextView) convertView.findViewById(R.id.textview_timer);
        convertView.setTag(holder);
    }
    ViewHolder holder = (ViewHolder) convertView.getTag();
    Item item = data.get (position);
    holder.tvName.setText (item.getName ());
    myTimer.setTimer (holder.tvTimer, item.getTime ());
    return convertView;
}


