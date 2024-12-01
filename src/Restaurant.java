
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Restaurant extends javax.swing.JFrame {

    int chickenNum , meatNum , waterNum, juiceNum;
    double chickenPrice, meatPrice, waterPrice, juicePrice;
    final double CHICKEN_COST = 400.0, MEAT_COST = 500.0, WATER_COST = 100.0, JUICE_COST = 250.0, CHEESE_COST = 100.0;
    double subtotal, vat, total;
    int customerCounter;
    PrintWriter output;
    public Restaurant() {
        initComponents();
    }

    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        customerCounterLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chickenCounter = new javax.swing.JSpinner();
        meatCounter = new javax.swing.JSpinner();
        chickenPriceLabel = new javax.swing.JLabel();
        chickenCheese = new javax.swing.JCheckBox();
        meatCheese = new javax.swing.JCheckBox();
        meatPriceLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        waterCounter = new javax.swing.JSpinner();
        juiceCounter = new javax.swing.JSpinner();
        waterPriceLabel = new javax.swing.JLabel();
        juicePriceLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        subtotalLabel = new javax.swing.JLabel();
        vatLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        calculate = new javax.swing.JButton();
        saveBill = new javax.swing.JButton();
        newBill = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerCounterLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerCounterLabel.setText("رقم الفاتورة: 0");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المأكولات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("شاورما دجاج");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("شاورما لحم");

        chickenCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        chickenCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickenCounterStateChanged(evt);
            }
        });

        meatCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        meatCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatCounterStateChanged(evt);
            }
        });

        chickenPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chickenPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chickenPriceLabel.setText("0.0 ريال");

        chickenCheese.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chickenCheese.setText("جبنة");
        chickenCheese.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        chickenCheese.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chickenCheese.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickenCheeseStateChanged(evt);
            }
        });
        chickenCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenCheeseActionPerformed(evt);
            }
        });

        meatCheese.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        meatCheese.setText("جبنة");
        meatCheese.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        meatCheese.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        meatCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatCheeseActionPerformed(evt);
            }
        });

        meatPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        meatPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        meatPriceLabel.setText("0.0 ريال");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chickenPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(meatPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(meatCheese)
                    .addComponent(chickenCheese))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(meatCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chickenCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(chickenCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chickenCheese)
                    .addComponent(chickenPriceLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(meatPriceLabel)
                    .addComponent(meatCheese)
                    .addComponent(meatCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المشروبات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ماء");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("عصير");

        waterCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        waterCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                waterCounterStateChanged(evt);
            }
        });

        juiceCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        juiceCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                juiceCounterStateChanged(evt);
            }
        });

        waterPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        waterPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        waterPriceLabel.setText("0.0 ريال");

        juicePriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        juicePriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        juicePriceLabel.setText("0.0 ريال");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(juicePriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(juiceCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(waterPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(waterCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(waterCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(waterPriceLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(juiceCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(juicePriceLabel))
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الحساب", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        subtotalLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subtotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subtotalLabel.setText("المجموع: 0.0 ريال");

        vatLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vatLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        vatLabel.setText("الضريبة: 0.0 ريال");

        totalLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalLabel.setText("الإجمالي: 0.0 ريال");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtotalLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vatLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtotalLabel)
                .addGap(12, 12, 12)
                .addComponent(vatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalLabel)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "خيارات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        calculate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calculate.setText("حساب");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        saveBill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveBill.setText("احفظ الفاتورة");
        saveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBillActionPerformed(evt);
            }
        });

        newBill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newBill.setText("فاتورة جديدة");
        newBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(newBill)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(saveBill))
                    .addComponent(calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBill)
                    .addComponent(newBill))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("تطوير م-ايمن القدسي , م-سياف العامري");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("نظام إدارة مطعم ");

        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setText("خروج");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(customerCounterLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(customerCounterLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addComponent(exit))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chickenCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenCheeseActionPerformed

        if (chickenCheese.isSelected()) {
            chickenPrice += CHEESE_COST*chickenNum;
        }
        else{
            chickenPrice -= CHEESE_COST*chickenNum;
        }
        chickenPriceLabel.setText(chickenPrice + " ريال");
    }//GEN-LAST:event_chickenCheeseActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed

        // Calculate subtotal
        subtotal = chickenPrice + meatPrice + waterPrice + juicePrice;
        subtotalLabel.setText("المجموع: " + subtotal + " ريال");

        // Calculate vat
        vat = 0.0;
        vat = (double) ((int) vat);
        vatLabel.setText("الضريبة: " + vat + " ريال (لا يوجد ضرائب)");

        // Calculate total
        total = subtotal + vat;
        totalLabel.setText("الإجمالي: " + total + " ريال");

    }//GEN-LAST:event_calculateActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void chickenCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickenCounterStateChanged

        chickenNum = (Integer) chickenCounter.getValue();
        chickenPrice = chickenNum * CHICKEN_COST;
        chickenPriceLabel.setText(chickenPrice + " ريال");

    }//GEN-LAST:event_chickenCounterStateChanged

    private void meatCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatCounterStateChanged

        meatNum = (Integer) meatCounter.getValue();
        meatPrice = meatNum * MEAT_COST;
        meatPriceLabel.setText(meatPrice + " ريال");

    }//GEN-LAST:event_meatCounterStateChanged

    private void waterCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_waterCounterStateChanged

        waterNum = (Integer) waterCounter.getValue();
        waterPrice = waterNum * WATER_COST;
        waterPriceLabel.setText(waterPrice + " ريال");

    }//GEN-LAST:event_waterCounterStateChanged

    private void juiceCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_juiceCounterStateChanged

        juiceNum = (Integer) juiceCounter.getValue();
        juicePrice = juiceNum * JUICE_COST;
        juicePriceLabel.setText(juicePrice + " ريال");

    }//GEN-LAST:event_juiceCounterStateChanged

    private void meatCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatCheeseActionPerformed

        if (meatCheese.isSelected()) {
            meatPrice += CHEESE_COST*meatNum;
        }
        else{
            meatPrice -= CHEESE_COST*meatNum;
        }
        meatPriceLabel.setText(meatPrice + " ريال");

    }//GEN-LAST:event_meatCheeseActionPerformed

    private void saveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBillActionPerformed

        try {

            if (total != 0) {

                output = new PrintWriter("bill_No-" + customerCounter + ".txt");

                output.println(customerCounter + " فاتورة رقم");
                output.println("==============");

                if (chickenNum != 0) {
                    output.print(chickenNum + "شاورما دجاج ");

                    if (chickenCheese.isSelected()) {
                        output.println(" مع الجبنة");
                    }
                    else{output.print("\n");}
                    output.println(chickenPrice + " ريال");
                }
                output.println("----------");

                if (meatNum != 0) {
                    output.print(meatNum + "شاورما لحم ");

                    if (meatCheese.isSelected()) {
                        output.println(" مع الجبنة");
                    }
                    else{output.print("\n");}
                    output.println(meatPrice + " ريال");
                }
                output.println("----------");
                if (waterNum != 0) {
                    output.println(waterNum + " ماء");
                    output.println(waterPrice + " ريال");
                }
                output.println("----------");
                if (juiceNum != 0) {
                    output.println(juiceNum + " عصير");
                    output.println(juicePrice + " ريال");
                }
                output.println("----------");
                output.println("----");
                output.println("المجموع: " + subtotal + " ريال");
                output.println("الضريبة: " + vat + " ريال");
                output.println("الإجمالي: " + total + " ريال");
                output.println();
                output.println("***بالعافية عليكم***");

                output.close();

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_saveBillActionPerformed

    private void newBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBillActionPerformed

        if (total != 0) {
            customerCounter++;
            customerCounterLabel.setText("رقم الفاتورة: " + customerCounter);

            chickenCounter.setValue(0);
            meatCounter.setValue(0);
            waterCounter.setValue(0);
            juiceCounter.setValue(0);

            chickenCheese.setSelected(false);
            meatCheese.setSelected(false);

            subtotalLabel.setText("المجموع: 0.0 ريال");
            vatLabel.setText("الضريبة: 0.0 ريال");
            totalLabel.setText("الإجمالي: 0.0 ريال");

            subtotal = 0;
            vat = 0;
            total = 0;
        }

    }//GEN-LAST:event_newBillActionPerformed

    private void chickenCheeseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickenCheeseStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_chickenCheeseStateChanged

    public static void main(String args[]) {

        //System.out.println(System.getProperty("user.dir"));
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
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JCheckBox chickenCheese;
    private javax.swing.JSpinner chickenCounter;
    private javax.swing.JLabel chickenPriceLabel;
    private javax.swing.JLabel customerCounterLabel;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner juiceCounter;
    private javax.swing.JLabel juicePriceLabel;
    private javax.swing.JCheckBox meatCheese;
    private javax.swing.JSpinner meatCounter;
    private javax.swing.JLabel meatPriceLabel;
    private javax.swing.JButton newBill;
    private javax.swing.JButton saveBill;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel vatLabel;
    private javax.swing.JSpinner waterCounter;
    private javax.swing.JLabel waterPriceLabel;
    // End of variables declaration//GEN-END:variables
}
