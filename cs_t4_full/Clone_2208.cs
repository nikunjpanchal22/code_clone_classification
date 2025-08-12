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
    string customer = customerTxt.Text;
    int quantity = Convert.ToInt32 (quantityTxt.Text);
    float weight = float.Parse (weightTxt.Text);
    string material = materialTxt.Text;
    string piece = pieceTxt.Text;
    if (!String.IsNullOrEmpty(customer) && !String.IsNullOrEmpty(piece) && !String.IsNullOrEmpty(material)) {
        AllItems.Add(new Liste {Customer = customer, Piece = piece, Material = material, Quantity = quantity, Weight = weight});
    }
}


