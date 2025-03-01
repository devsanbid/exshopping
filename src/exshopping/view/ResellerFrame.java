/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package exshopping.view;

import exshopping.controller.Product;
import exshopping.controller.ProductController;
import static exshopping.controller.ProductController.addProduct;
import static exshopping.controller.ProductController.fetchAllProducts;
import static exshopping.controller.ProductController.getProductById;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanbid
 */
public class ResellerFrame extends javax.swing.JPanel {
	private File selectedImageFile = null;

	/**
	 * Creates new form ResellerFrame
	 */
	public ResellerFrame() {
		initComponents();
		populateProductTable();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        price_input = new javax.swing.JTextField();
        remove_btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        id_input = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        product_name_input = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        description_input = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        category_input = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        stock_input = new javax.swing.JTextField();
        upload_btn = new javax.swing.JButton();
        fetch_btn1 = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("SansSerif.plain", 0, 36)); // NOI18N
        jLabel1.setText("Reseller ");

        jLabel2.setFont(new java.awt.Font("Iosevka NFM ExtraLight", 1, 36)); // NOI18N
        jLabel2.setText("Product");

        jLabel10.setFont(new java.awt.Font("Iosevka NFM ExtraLight", 1, 24)); // NOI18N
        jLabel10.setText("Price:");

        price_input.setFont(new java.awt.Font("Iosevka NF", 0, 36)); // NOI18N
        price_input.setText("xxx");
        price_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_inputActionPerformed(evt);
            }
        });

        remove_btn.setFont(new java.awt.Font("Iosevka NFP SemiBold", 0, 24)); // NOI18N
        remove_btn.setText("Remove Product");
        remove_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove_btnMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Iosevka NFM ExtraLight", 1, 36)); // NOI18N
        jLabel11.setText("ID:");

        id_input.setFont(new java.awt.Font("Iosevka NF", 0, 36)); // NOI18N
        id_input.setText("xxx");
        id_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_inputActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Iosevka NFM ExtraLight", 1, 24)); // NOI18N
        jLabel12.setText("Stock Quanity");

        product_name_input.setFont(new java.awt.Font("Iosevka NF", 0, 36)); // NOI18N
        product_name_input.setText("xxx");
        product_name_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_name_inputActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Iosevka NFM ExtraLight", 1, 24)); // NOI18N
        jLabel13.setText("Product Name:");

        description_input.setColumns(20);
        description_input.setRows(5);
        jScrollPane2.setViewportView(description_input);

        jLabel14.setFont(new java.awt.Font("Iosevka NFM ExtraLight", 1, 24)); // NOI18N
        jLabel14.setText("Description:");

        category_input.setFont(new java.awt.Font("Iosevka NF", 0, 36)); // NOI18N
        category_input.setText("xxx");
        category_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_inputActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Iosevka NFM ExtraLight", 1, 24)); // NOI18N
        jLabel15.setText("Category");

        stock_input.setFont(new java.awt.Font("Iosevka NF", 0, 36)); // NOI18N
        stock_input.setText("xxx");
        stock_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_inputActionPerformed(evt);
            }
        });

        upload_btn.setText("Upload Image");
        upload_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upload_btnMouseClicked(evt);
            }
        });

        fetch_btn1.setFont(new java.awt.Font("Iosevka NFP SemiBold", 0, 24)); // NOI18N
        fetch_btn1.setText("Fetch");
        fetch_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fetch_btn1MouseClicked(evt);
            }
        });

        update_btn.setFont(new java.awt.Font("Iosevka NFP SemiBold", 0, 24)); // NOI18N
        update_btn.setText("Update Product");
        update_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_btnMouseClicked(evt);
            }
        });

        add_btn.setFont(new java.awt.Font("Iosevka NFP SemiBold", 0, 24)); // NOI18N
        add_btn.setText("Add Product");
        add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_btnMouseClicked(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(price_input, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(remove_btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(id_input, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(product_name_input, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(category_input, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(stock_input, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(upload_btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fetch_btn1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(update_btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(add_btn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addComponent(jLabel10))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(upload_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(remove_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(product_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(price_input, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(category_input, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jLabel11)
                    .addContainerGap(667, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(id_input, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(413, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jLabel13)
                    .addContainerGap(645, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jLabel14)
                    .addContainerGap(657, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(stock_input, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(508, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap(482, Short.MAX_VALUE)
                    .addComponent(fetch_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(221, 221, 221)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(255, 255, 255)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price_input, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(category_input, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(upload_btn)
                .addGap(63, 63, 63)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remove_btn)
                    .addComponent(update_btn)
                    .addComponent(add_btn))
                .addGap(76, 76, 76))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(jLabel11)
                    .addContainerGap(909, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(id_input, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(909, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(343, 343, 343)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(784, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(485, 485, 485)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(642, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap(841, Short.MAX_VALUE)
                    .addComponent(stock_input, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(284, 284, 284)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(196, 196, 196)
                    .addComponent(fetch_btn1)
                    .addContainerGap(928, Short.MAX_VALUE)))
        );

        jLabel5.setFont(new java.awt.Font("Iosevka NFM ExtraLight", 1, 36)); // NOI18N
        jLabel5.setText("All Products:");

        product_table.setFont(new java.awt.Font("Iosevka NF", 0, 30)); // NOI18N
        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        product_table.setRowHeight(60);
        jScrollPane1.setViewportView(product_table);

        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void price_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_inputActionPerformed

    private void id_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_inputActionPerformed

    private void product_name_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_name_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_name_inputActionPerformed

    private void category_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category_inputActionPerformed

    private void stock_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stock_inputActionPerformed

    private void add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseClicked
        // TODO add your handling code here:
		String productName = product_name_input.getText().trim();
		String priceStr = price_input.getText().trim();
		String stockStr = stock_input.getText().trim();
		String category = category_input.getText().trim();
		String description = description_input.getText().trim();

		// Validation checks
		if (productName.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Product name cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
			product_name_input.requestFocus();
			return;
		}

		// Validate price
		double price;
		try {
			price = Double.parseDouble(priceStr);
			if (price <= 0) {
				JOptionPane.showMessageDialog(this, "Price must be a positive number", "Validation Error", JOptionPane.ERROR_MESSAGE);
				price_input.requestFocus();
				return;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Invalid price value", "Validation Error", JOptionPane.ERROR_MESSAGE);
			price_input.requestFocus();
			return;
		}

		// Validate stock
		double stock;
		try {
			stock = Double.parseDouble(stockStr);
			if (stock < 0) {
				JOptionPane.showMessageDialog(this, "Stock cannot be negative", "Validation Error", JOptionPane.ERROR_MESSAGE);
				stock_input.requestFocus();
				return;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Invalid stock value", "Validation Error", JOptionPane.ERROR_MESSAGE);
			stock_input.requestFocus();
			return;
		}

		// Validate category
		if (category.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Category cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
			category_input.requestFocus();
			return;
		}

		// Validate description
		if (description.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Description cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
			description_input.requestFocus();
			return;
		}

		// Add product (including image)
		addProduct(productName, price, description, stock, category, selectedImageFile);

		// Clear inputs after successful addition
		clearInputFields();
	populateProductTable();
    }//GEN-LAST:event_add_btnMouseClicked

	private void clearInputFields() {
		product_name_input.setText("");
		price_input.setText("");
		stock_input.setText("");
		category_input.setText("");
		description_input.setText("");
		selectedImageFile = null;
	}

    private void upload_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upload_btnMouseClicked
        // TODO add your handling code here:
		JFileChooser fileChooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Image Files", "jpg", "png", "gif", "jpeg"
		);
		fileChooser.setFileFilter(filter);

		int result = fileChooser.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			File selectedImageFile = fileChooser.getSelectedFile();

			// Optional: Show selected file name or preview
			JOptionPane.showMessageDialog(this,
					"Selected Image: " + selectedImageFile.getName(),
					"Image Selected",
					JOptionPane.INFORMATION_MESSAGE
			);
		}
    }//GEN-LAST:event_upload_btnMouseClicked

    private void update_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_btnMouseClicked
        // TODO add your handling code here:

		int currentProductID = Integer.parseInt(id_input.getText().trim());
		
		if (currentProductID <= 0) {
			JOptionPane.showMessageDialog(this, "Please fetch a product first", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Validate inputs
		String productName = product_name_input.getText().trim();
		String priceStr = price_input.getText().trim();
		String description = description_input.getText().trim();

		if (productName.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Product name cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		double price;
		try {
			price = Double.parseDouble(priceStr);
			if (price <= 0) {
				JOptionPane.showMessageDialog(this, "Price must be positive", "Validation Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Invalid price", "Validation Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (description.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Description cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		ProductController.updateProduct(currentProductID, productName, price, description );

		// Reset after update
		currentProductID = -1;
		selectedImageFile = null;
		clearInputFields();
		populateProductTable();
		
    }//GEN-LAST:event_update_btnMouseClicked

	private void populateProductTable() {
		List<Product> products = fetchAllProducts();

		String[] columnNames = {
			"ID", "Product Name", "Price", "Description",
			"Image Path", "Stock Quantity", "Category"
		};

		DefaultTableModel model = new DefaultTableModel(columnNames, 0);

		for (Product product : products) {
			Object[] rowData = {
				product.getProductId(),
				product.getProductName(),
				product.getPrice(),
				product.getDescription(),
				product.getImagePath(),
				product.getStockQuantity(),
				product.getCategory()
			};
			model.addRow(rowData);
		}

		product_table.setModel(model);

	}

    private void fetch_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fetch_btn1MouseClicked
        // TODO add your handling code here:
		try {
			int productId = Integer.parseInt(id_input.getText().trim());

			Object[] productData = getProductById(productId);

			if (productData != null) {
				product_name_input.setText((String) productData[1]);
				price_input.setText(String.valueOf(productData[2]));
				description_input.setText((String) productData[3]);
				category_input.setText((String) productData[6]);
				stock_input.setText(String.valueOf(productData[5]));

				JOptionPane.showMessageDialog(this, "Product found", "Success", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(this, "Product not found", "Error", JOptionPane.ERROR_MESSAGE);
				clearInputFields();
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Invalid Product ID", "Error", JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_fetch_btn1MouseClicked

    private void remove_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_btnMouseClicked
        // TODO add your handling code here:
		int currentProductID = Integer.parseInt(id_input.getText().trim());
		ProductController.removeProduct(currentProductID);
		
    }//GEN-LAST:event_remove_btnMouseClicked

	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		System.out.println("ResellerFrame running...");
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				JFrame frame = new JFrame("Reseller");
				ResellerFrame panel = new ResellerFrame();
				frame.add(panel);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField category_input;
    private javax.swing.JTextArea description_input;
    private javax.swing.JButton fetch_btn1;
    private javax.swing.JTextField id_input;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField price_input;
    private javax.swing.JTextField product_name_input;
    private javax.swing.JTable product_table;
    private javax.swing.JButton remove_btn;
    private javax.swing.JTextField stock_input;
    private javax.swing.JButton update_btn;
    private javax.swing.JButton upload_btn;
    // End of variables declaration//GEN-END:variables
}
