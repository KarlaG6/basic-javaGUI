package com.mycompany.excer;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karla
 */
public class class2 extends javax.swing.JFrame {
	public Color colores[] = {Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE};
	/**
	 * Creates new form class2
	 */
	public class2() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stateGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbNeg = new javax.swing.JRadioButton();
        rbNul = new javax.swing.JRadioButton();
        rbPos = new javax.swing.JRadioButton();
        boton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbmus = new javax.swing.JCheckBox();
        cbcod = new javax.swing.JCheckBox();
        cbLea = new javax.swing.JCheckBox();
        cbcle = new javax.swing.JCheckBox();
        combo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Trabajo con Botones");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Estado Numero")));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        stateGroup.add(rbNeg);
        rbNeg.setText("Negativo");
        rbNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNegActionPerformed(evt);
            }
        });

        stateGroup.add(rbNul);
        rbNul.setText("Nulo");
        rbNul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNulActionPerformed(evt);
            }
        });

        stateGroup.add(rbPos);
        rbPos.setText("Positivo");
        rbPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbNeg, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(rbNul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rbNeg)
                .addGap(18, 18, 18)
                .addComponent(rbNul)
                .addGap(18, 18, 18)
                .addComponent(rbPos)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        boton.setText("OK");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hobbies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel2.setAlignmentY(0.4F);

        cbmus.setText("Music");
        cbmus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmusActionPerformed(evt);
            }
        });

        cbcod.setText("Code");
        cbcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcodActionPerformed(evt);
            }
        });

        cbLea.setText("Learn");
        cbLea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLeaActionPerformed(evt);
            }
        });

        cbcle.setText("Clean");
        cbcle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbcle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbLea, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcod, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbmus, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cbmus)
                .addGap(13, 13, 13)
                .addComponent(cbcod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(cbLea)
                .addGap(13, 13, 13)
                .addComponent(cbcle)
                .addGap(12, 12, 12))
        );

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hola", "adios", "hasta luego" }));
        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
            }
        });
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(boton)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(boton)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNegActionPerformed
//       JOptionPane.showMessageDialog(null, "Has seleccionado negativo");
	getContentPane().setBackground(Color.PINK);
    }//GEN-LAST:event_rbNegActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
       
	String estado="", hobbies="";
	   
	if (rbNeg.isSelected())
		estado="negativo";
	else if (rbPos.isSelected())
		estado="positivo";
	else if (rbNul.isSelected())
		estado="nulo";
	JOptionPane.showMessageDialog(null, "estado "+ estado);
	
	if (cbmus.isSelected())
		hobbies+=" music";
	if (cbcod.isSelected())
		hobbies+=" code";
	if (cbcle.isSelected())
		hobbies+=" clean";
	if (cbLea.isSelected())
		hobbies+=" learn";
	JOptionPane.showMessageDialog(null, "hobbies\n "+ hobbies);
	
	
    }//GEN-LAST:event_botonActionPerformed

    private void rbNulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNulActionPerformed
	getContentPane().setBackground(Color.YELLOW);
    }//GEN-LAST:event_rbNulActionPerformed

    private void rbPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPosActionPerformed
	getContentPane().setBackground(Color.CYAN);
    }//GEN-LAST:event_rbPosActionPerformed

    private void cbLeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLeaActionPerformed
       if (cbLea.isSelected() == true)
		cbLea.setFont(new Font ("Arial", 1,14));
	else
		cbLea.setFont( new Font("tahoma", 0, 12));
    }//GEN-LAST:event_cbLeaActionPerformed

    private void cbmusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmusActionPerformed
	if (cbmus.isSelected() == true)
		cbmus.setFont(new Font ("Arial", 1,14));
	else
		cbmus.setFont( new Font("tahoma", 0, 12));
    }//GEN-LAST:event_cbmusActionPerformed

    private void cbcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcodActionPerformed
       if (cbcod.isSelected() == true)
		cbcod.setFont(new Font ("Arial", 1,14));
	else
		cbcod.setFont( new Font("tahoma", 0, 12));
    }//GEN-LAST:event_cbcodActionPerformed

    private void cbcleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcleActionPerformed
       if (cbcle.isSelected() == true)
		cbcle.setFont(new Font ("Arial", 1,14));
	else
		cbcle.setFont( new Font("tahoma", 0, 12));
    }//GEN-LAST:event_cbcleActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
//       if ( combo.getSelectedIndex() == 0)
//		   JOptionPane.showMessageDialog(null, "hola");
//	devuelve la posicion por color
	getContentPane().setBackground(colores[combo.getSelectedIndex()]);
	
	System.out.println("index "+combo.getSelectedIndex() );
	
	if (combo.getSelectedIndex() == 0) {
		
	}
	
	if (combo.getSelectedItem() == "adios")
		JOptionPane.showMessageDialog(null, "adios");
	
	String x = String.valueOf(combo.getSelectedItem()) ;
		System.out.println(x);
    }//GEN-LAST:event_comboItemStateChanged

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
			java.util.logging.Logger.getLogger(class2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(class2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(class2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(class2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new class2().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JCheckBox cbLea;
    private javax.swing.JCheckBox cbcle;
    private javax.swing.JCheckBox cbcod;
    private javax.swing.JCheckBox cbmus;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbNeg;
    private javax.swing.JRadioButton rbNul;
    private javax.swing.JRadioButton rbPos;
    private javax.swing.ButtonGroup stateGroup;
    // End of variables declaration//GEN-END:variables
}
