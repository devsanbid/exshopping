package exshopping.view;

import exshopping.controller.AuthenticationController;
import exshopping.controller.CartController;
import exshopping.controller.DiscountController;
import exshopping.controller.OrderController;
import exshopping.model.CartItem;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sanbid
 */
public class AddCartFrame extends javax.swing.JFrame {

	/**
	 * Creates new form AddCartFrame
	 */
	public AddCartFrame() {
		initComponents();
		AddCartFrame();
	}

	public void AddCartFrame() {

		addcart_table.setRowMargin(10); // Vertical padding
		addcart_table.setIntercellSpacing(new Dimension(15, 10));
		addcart_table.setRowHeight(30); // Set a specific row height

		// Get the current logged-in user's ID
		int userId = AuthenticationController.getUserId();

		// Fetch cart items
		List<CartItem> cartItems = CartController.getUserCart(userId);

		// Create table model
		DefaultTableModel model = (DefaultTableModel) addcart_table.getModel();
		model.setRowCount(0); // Clear existing rows


		// Variables to calculate totals
		double subtotal = 0;
		double discount = 0; 

		// Populate table
		for (CartItem item : cartItems) {
			model.addRow(new Object[]{
				item.getProductName(),
				item.getPrice(),
				item.getQuantity(),
				item.getPrice() * item.getQuantity(),

			});





			// Calculate subtotal
			subtotal += item.getPrice() * item.getQuantity();
		}

		// Update labels
		subtotal_label.setText(String.format("$%.2f", subtotal));
		discount_label.setText(String.format("$%.2f", discount));
		total_label.setText(String.format("$%.2f", subtotal - discount));
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about_btn = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        search_btn2 = new javax.swing.JButton();
        login_btn = new javax.swing.JLabel();
        Home_btn = new javax.swing.JLabel();
        contact_btn = new javax.swing.JLabel();
        about_btn1 = new javax.swing.JLabel();
        search_input = new javax.swing.JTextField();
        search_btn1 = new javax.swing.JButton();
        addcart_btn1 = new javax.swing.JButton();
        profile_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addcart_table = new javax.swing.JTable();
        discount_input = new javax.swing.JTextField();
        discount_btn = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        subtotal_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        discount_label = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        buy_btn = new javax.swing.JButton();

        about_btn.setText("About");

        search_btn2.setText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login_btn.setFont(new java.awt.Font("SansSerif.plain", 1, 24)); // NOI18N
        login_btn.setText("Ex Shopping");

        Home_btn.setText("Home");
        Home_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_btnMouseClicked(evt);
            }
        });

        contact_btn.setText("Contact");

        about_btn1.setText("About");

        search_input.setFont(new java.awt.Font("SansSerif.plain", 0, 18)); // NOI18N
        search_input.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        search_input.setText("what are you looking for ?");
        search_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_inputActionPerformed(evt);
            }
        });

        search_btn1.setText("");

        addcart_btn1.setText("󰄐");
        addcart_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addcart_btn1MouseClicked(evt);
            }
        });

        profile_btn.setText("");
        profile_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profile_btnMouseClicked(evt);
            }
        });

        addcart_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product", "Price", "Quantity", "sub-total", "Action"
            }
        ));
        jScrollPane1.setViewportView(addcart_table);

        discount_input.setText("xxx");

        discount_btn.setText("Apply coupon");
        discount_btn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                discount_btnMouseMoved(evt);
            }
        });
        discount_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discount_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif.plain", 1, 24)); // NOI18N
        jLabel1.setText("Cart Total");

        jLabel2.setText("subtotal");

        subtotal_label.setText("$173");

        jLabel4.setText("discount");

        discount_label.setText("$12");

        jLabel3.setText("Total");

        total_label.setText("$1324");

        buy_btn.setText("Buy");
        buy_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buy_btnMouseClicked(evt);
            }
        });
        buy_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_btnActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(subtotal_label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(discount_label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(total_label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(buy_btn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(total_label))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(discount_label))
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subtotal_label)))
                        .addGap(35, 35, 35))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(buy_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(subtotal_label))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(discount_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(total_label))
                .addGap(37, 37, 37)
                .addComponent(buy_btn)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(login_btn)
                        .addGap(249, 249, 249)
                        .addComponent(Home_btn)
                        .addGap(83, 83, 83)
                        .addComponent(contact_btn)
                        .addGap(76, 76, 76)
                        .addComponent(about_btn1)
                        .addGap(65, 65, 65)
                        .addComponent(search_input, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(search_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(addcart_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(profile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(discount_input, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(discount_btn)
                            .addGap(230, 230, 230)
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1379, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_btn)
                    .addComponent(Home_btn)
                    .addComponent(contact_btn)
                    .addComponent(about_btn1)
                    .addComponent(search_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn1)
                    .addComponent(addcart_btn1)
                    .addComponent(profile_btn))
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discount_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discount_btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void search_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_inputActionPerformed

    private void discount_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discount_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discount_btnActionPerformed

    private void buy_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buy_btnActionPerformed

    private void discount_btnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discount_btnMouseMoved
        // TODO add your handling code here:
		String discountCode = discount_input.getText().trim();

		// Calculate subtotal
		double subtotal = CartController.getCartTotal(AuthenticationController.getUserId());

		// Validate and apply discount
		double discountAmount = DiscountController.validateDiscount(discountCode, subtotal);

		if (discountAmount > 0) {
			// Update UI
			discount_label.setText(String.format("$%.2f", discountAmount));
			total_label.setText(String.format("$%.2f", subtotal - discountAmount));

			JOptionPane.showMessageDialog(this, "Discount applied successfully!");
		} else {
			JOptionPane.showMessageDialog(this, "Invalid or expired discount code");
			discount_label.setText("$0.00");
			total_label.setText(String.format("$%.2f", subtotal));
		}
    }//GEN-LAST:event_discount_btnMouseMoved

    private void buy_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buy_btnMouseClicked
        // TODO add your handling code here:
		int userId = AuthenticationController.getUserId();
		int orderId = OrderController.createOrder(userId);
		System.out.println("userId: " + userId);
		System.out.println("orderId: " + orderId);

		if (orderId != -1) {
			JOptionPane.showMessageDialog(this, "Order placed successfully! Order ID: " + orderId);
			CartController.clearAllCartData();
	AddCartFrame();

		} else {
			JOptionPane.showMessageDialog(this, "Failed to place order");
		}
    }//GEN-LAST:event_buy_btnMouseClicked

    private void Home_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_btnMouseClicked
        // TODO add your handling code here:
		new HomeFrame().setVisible(true);
		this.dispose();
    }//GEN-LAST:event_Home_btnMouseClicked

    private void addcart_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcart_btn1MouseClicked
        // TODO add your handling code here:
		new AddCartFrame().setVisible(true);
		this.dispose();
    }//GEN-LAST:event_addcart_btn1MouseClicked

    private void profile_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_btnMouseClicked
        // TODO add your handling code here:
		new Profile().setVisible(true);
		this.dispose();
    }//GEN-LAST:event_profile_btnMouseClicked

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AddCartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AddCartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AddCartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AddCartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddCartFrame().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Home_btn;
    public javax.swing.JLabel about_btn;
    public javax.swing.JLabel about_btn1;
    public javax.swing.JButton addcart_btn1;
    public javax.swing.JTable addcart_table;
    private javax.swing.JButton buy_btn;
    public javax.swing.JLabel contact_btn;
    private javax.swing.JButton discount_btn;
    private javax.swing.JTextField discount_input;
    public javax.swing.JLabel discount_label;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JLabel login_btn;
    public javax.swing.JButton profile_btn;
    public javax.swing.JButton search_btn1;
    public javax.swing.JButton search_btn2;
    public javax.swing.JTextField search_input;
    public javax.swing.JLabel subtotal_label;
    public javax.swing.JLabel total_label;
    // End of variables declaration//GEN-END:variables


}
