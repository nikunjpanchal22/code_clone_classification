private void btnAdd_Click (object sender, RoutedEventArgs e) {
    string customer = btnEditCustomer1.Text;
    string piece = btnPiece.Text;
    string material = txtMaterial.Text;
    int quantity = Convert.ToInt32 (txtQuantity.Text);
    float weight = float.Parse (txtWeight.Text);
    if (customer != null && piece != null && material != null) {
        var item = new Liste {Customer = customer, Piece = piece, Material = material, Quantity = quantity, Weight = weight};
        AllItems.Add (item);
    }
}


 private void btnAdd_Click (object sender, RoutedEventArgs e) {
      string customer = btnEditCustomer1.Text?.Trim();
      string piece = btnPiece.Text?.Trim();
      string material = txtMaterial.Text?.Trim();
      if (string.IsNullOrWhiteSpace(customer) || string.IsNullOrWhiteSpace(piece) || string.IsNullOrWhiteSpace(material))
          return;
 
      int quantity;
      if (!int.TryParse(txtQuantity.Text, out quantity))
          return;
 
      float weight;
      if (!float.TryParse(txtWeight.Text, out weight))
          return;
 
      var item = new Liste {Customer = customer, Piece = piece, Material = material, Quantity = quantity, Weight = weight};
      AllItems.Add(item);
}


