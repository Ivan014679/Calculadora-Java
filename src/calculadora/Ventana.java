/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Color;

/**
 *
 * @author AULA1
 */
public class Ventana extends javax.swing.JFrame {

    public int numero1=0;
    boolean verfigual = false;
    public String op;
            
    public Ventana() {
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

        jPanel3 = new javax.swing.JPanel();
        resultado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botmultiplicacion = new javax.swing.JButton();
        botigual = new javax.swing.JButton();
        botdivision = new javax.swing.JButton();
        botmas = new javax.swing.JButton();
        bot9 = new javax.swing.JButton();
        botmenos = new javax.swing.JButton();
        bot6 = new javax.swing.JButton();
        bot7 = new javax.swing.JButton();
        bot8 = new javax.swing.JButton();
        bot3 = new javax.swing.JButton();
        bot4 = new javax.swing.JButton();
        bot5 = new javax.swing.JButton();
        bot0 = new javax.swing.JButton();
        bot1 = new javax.swing.JButton();
        bot2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(100, 125));
        setPreferredSize(new java.awt.Dimension(415, 350));

        jPanel3.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        resultado.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultado.setText("0");
        jPanel3.add(resultado);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel4.setLayout(new java.awt.GridLayout(5, 3));

        botmultiplicacion.setText("*");
        botmultiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botmultiplicacionMouseClicked(evt);
            }
        });
        botmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botmultiplicacionActionPerformed(evt);
            }
        });
        jPanel4.add(botmultiplicacion);

        botigual.setText("=");
        botigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botigualActionPerformed(evt);
            }
        });
        jPanel4.add(botigual);

        botdivision.setText("/");
        botdivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botdivisionMouseClicked(evt);
            }
        });
        botdivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botdivisionActionPerformed(evt);
            }
        });
        jPanel4.add(botdivision);

        botmas.setText("+");
        botmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botmasMouseClicked(evt);
            }
        });
        botmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botmasActionPerformed(evt);
            }
        });
        jPanel4.add(botmas);

        bot9.setText("9");
        bot9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bot9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bot9MouseExited(evt);
            }
        });
        bot9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot9ActionPerformed(evt);
            }
        });
        jPanel4.add(bot9);

        botmenos.setText("-");
        botmenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botmenosMouseClicked(evt);
            }
        });
        botmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botmenosActionPerformed(evt);
            }
        });
        jPanel4.add(botmenos);

        bot6.setText("6");
        bot6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bot6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bot6MouseExited(evt);
            }
        });
        bot6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot6ActionPerformed(evt);
            }
        });
        jPanel4.add(bot6);

        bot7.setText("7");
        bot7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bot7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bot7MouseExited(evt);
            }
        });
        bot7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot7ActionPerformed(evt);
            }
        });
        jPanel4.add(bot7);

        bot8.setText("8");
        bot8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bot8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bot8MouseExited(evt);
            }
        });
        bot8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot8ActionPerformed(evt);
            }
        });
        jPanel4.add(bot8);

        bot3.setText("3");
        bot3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bot3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bot3MouseExited(evt);
            }
        });
        bot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot3ActionPerformed(evt);
            }
        });
        jPanel4.add(bot3);

        bot4.setText("4");
        bot4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bot4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bot4MouseExited(evt);
            }
        });
        bot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot4ActionPerformed(evt);
            }
        });
        jPanel4.add(bot4);

        bot5.setText("5");
        bot5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bot5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bot5MouseExited(evt);
            }
        });
        bot5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot5ActionPerformed(evt);
            }
        });
        jPanel4.add(bot5);

        bot0.setText("0");
        bot0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bot0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bot0MouseExited(evt);
            }
        });
        bot0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot0ActionPerformed(evt);
            }
        });
        jPanel4.add(bot0);

        bot1.setText("1");
        bot1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bot1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bot1MouseExited(evt);
            }
        });
        bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot1ActionPerformed(evt);
            }
        });
        jPanel4.add(bot1);

        bot2.setText("2");
        bot2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bot2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bot2MouseExited(evt);
            }
        });
        bot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot2ActionPerformed(evt);
            }
        });
        jPanel4.add(bot2);

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot0ActionPerformed
        if(!"0".equals(resultado.getText()) && !"+".equals(resultado.getText()) && !"-".equals(resultado.getText()) || !"*".equals(resultado.getText()) && !"/".equals(resultado.getText()) && verfigual == false){
            resultado.setText(resultado.getText() + "0");
        }else{
            resultado.setText("0");
            verfigual = false;
            botigual.setForeground(Color.black);
            botigual.setFont(new java.awt.Font("Tahoma", 0, 11));
        }
    }//GEN-LAST:event_bot0ActionPerformed

    private void bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot1ActionPerformed
        if("0".equals(resultado.getText()) || "+".equals(resultado.getText()) || "-".equals(resultado.getText()) || "*".equals(resultado.getText()) || "/".equals(resultado.getText()) || verfigual == true){
            resultado.setText("1");
            verfigual = false;
            botigual.setForeground(Color.black);
            botigual.setFont(new java.awt.Font("Tahoma", 0, 11));
        }else{
            resultado.setText(resultado.getText() + "1");
        }
    }//GEN-LAST:event_bot1ActionPerformed

    private void bot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot2ActionPerformed
        if("0".equals(resultado.getText()) || "+".equals(resultado.getText()) || "-".equals(resultado.getText()) || "*".equals(resultado.getText()) || "/".equals(resultado.getText()) || verfigual == true){
            resultado.setText("2");
            verfigual = false;
            botigual.setForeground(Color.black);
            botigual.setFont(new java.awt.Font("Tahoma", 0, 11));
        }else{
            resultado.setText(resultado.getText() + "2");
        }
    }//GEN-LAST:event_bot2ActionPerformed

    private void bot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot3ActionPerformed
        if("0".equals(resultado.getText()) || "+".equals(resultado.getText()) || "-".equals(resultado.getText()) || "*".equals(resultado.getText()) || "/".equals(resultado.getText()) || verfigual == true){
            resultado.setText("3");
            verfigual = false;
            botigual.setForeground(Color.black);
            botigual.setFont(new java.awt.Font("Tahoma", 0, 11));
        }else{
            resultado.setText(resultado.getText() + "3");
        }
    }//GEN-LAST:event_bot3ActionPerformed

    private void bot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot4ActionPerformed
        if("0".equals(resultado.getText()) || "+".equals(resultado.getText()) || "-".equals(resultado.getText()) || "*".equals(resultado.getText()) || "/".equals(resultado.getText()) || verfigual == true){
            resultado.setText("4");
            verfigual = false;
            botigual.setForeground(Color.black);
            botigual.setFont(new java.awt.Font("Tahoma", 0, 11));
        }else{
            resultado.setText(resultado.getText() + "4");
        }
    }//GEN-LAST:event_bot4ActionPerformed

    private void bot5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot5ActionPerformed
        if("0".equals(resultado.getText()) || "+".equals(resultado.getText()) || "-".equals(resultado.getText()) || "*".equals(resultado.getText()) || "/".equals(resultado.getText()) || verfigual == true){
            resultado.setText("5");
            verfigual = false;
            botigual.setForeground(Color.black);
            botigual.setFont(new java.awt.Font("Tahoma", 0, 11));
        }else{
            resultado.setText(resultado.getText() + "5");
        }
    }//GEN-LAST:event_bot5ActionPerformed

    private void bot6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot6ActionPerformed
        if("0".equals(resultado.getText()) || "+".equals(resultado.getText()) || "-".equals(resultado.getText()) || "*".equals(resultado.getText()) || "/".equals(resultado.getText()) || verfigual == true){
            resultado.setText("6");
            verfigual = false;
            botigual.setForeground(Color.black);
            botigual.setFont(new java.awt.Font("Tahoma", 0, 11));
        }else{
            resultado.setText(resultado.getText() + "6");
        }
    }//GEN-LAST:event_bot6ActionPerformed

    private void bot7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot7ActionPerformed
        if("0".equals(resultado.getText()) || "+".equals(resultado.getText()) || "-".equals(resultado.getText()) || "*".equals(resultado.getText()) || "/".equals(resultado.getText()) || verfigual == true){
            resultado.setText("7");
            verfigual = false;
            botigual.setForeground(Color.black);
            botigual.setFont(new java.awt.Font("Tahoma", 0, 11));
        }else{
            resultado.setText(resultado.getText() + "7");
        }
    }//GEN-LAST:event_bot7ActionPerformed

    private void bot8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot8ActionPerformed
        if("0".equals(resultado.getText()) || "+".equals(resultado.getText()) || "-".equals(resultado.getText()) || "*".equals(resultado.getText()) || "/".equals(resultado.getText()) || verfigual == true){
            resultado.setText("8");
            verfigual = false;
            botigual.setForeground(Color.black);
            botigual.setFont(new java.awt.Font("Tahoma", 0, 11));
        }else{
            resultado.setText(resultado.getText() + "8");
        }
    }//GEN-LAST:event_bot8ActionPerformed

    private void bot9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot9ActionPerformed
        if("0".equals(resultado.getText()) || "+".equals(resultado.getText()) || "-".equals(resultado.getText()) || "*".equals(resultado.getText()) || "/".equals(resultado.getText()) || verfigual == true){
            resultado.setText("9");
            verfigual = false;
            botigual.setForeground(Color.black);
            botigual.setFont(new java.awt.Font("Tahoma", 0, 11));
        }else{
            resultado.setText(resultado.getText() + "9");
        }
    }//GEN-LAST:event_bot9ActionPerformed

    private void botmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botmasActionPerformed
        numero1 = Integer.parseInt(resultado.getText());
        resultado.setText("+");
        op = resultado.getText();
    }//GEN-LAST:event_botmasActionPerformed

    private void botigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botigualActionPerformed
        int numero2 = Integer.parseInt(resultado.getText());
        int res;
        double resd;
        if(null != op)switch (op) {
            case "+":
                res = numero1+numero2;
                resultado.setText(String.valueOf(res));
                botmas.setForeground(Color.black);
                botmas.setFont(new java.awt.Font("Tahoma", 0, 11));
                break;
            case "-":
                res = numero1-numero2;
                resultado.setText(String.valueOf(res));
                botmenos.setForeground(Color.black);
                botmenos.setFont(new java.awt.Font("Tahoma", 0, 11));
                break;
            case "*":
                res = numero1*numero2;
                resultado.setText(String.valueOf(res));
                botmultiplicacion.setForeground(Color.black);
                botmultiplicacion.setFont(new java.awt.Font("Tahoma", 0, 11));
                break;
            case "/":
                resd = (double) numero1/numero2;
                resultado.setText(String.valueOf(resd));
                botdivision.setForeground(Color.black);
                botdivision.setFont(new java.awt.Font("Tahoma", 0, 11));
                break;
            default:
                break;
        }
        verfigual = true;
        botigual.setForeground(Color.blue);
        botigual.setFont(new java.awt.Font("Tahoma", 1, 14));
        op = null;
    }//GEN-LAST:event_botigualActionPerformed

    private void bot0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot0MouseEntered
        bot0.setForeground(Color.red);
    }//GEN-LAST:event_bot0MouseEntered

    private void bot0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot0MouseExited
        bot0.setForeground(Color.black);
    }//GEN-LAST:event_bot0MouseExited

    private void bot1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot1MouseEntered
        bot1.setForeground(Color.red);
    }//GEN-LAST:event_bot1MouseEntered

    private void bot1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot1MouseExited
        bot1.setForeground(Color.black);
    }//GEN-LAST:event_bot1MouseExited

    private void bot2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot2MouseEntered
        bot2.setForeground(Color.red);
    }//GEN-LAST:event_bot2MouseEntered

    private void bot2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot2MouseExited
        bot2.setForeground(Color.black);
    }//GEN-LAST:event_bot2MouseExited

    private void bot3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot3MouseEntered
        bot3.setForeground(Color.red);
    }//GEN-LAST:event_bot3MouseEntered

    private void bot3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot3MouseExited
        bot3.setForeground(Color.black);
    }//GEN-LAST:event_bot3MouseExited

    private void bot4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot4MouseEntered
        bot4.setForeground(Color.red);
    }//GEN-LAST:event_bot4MouseEntered

    private void bot4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot4MouseExited
        bot4.setForeground(Color.black);
    }//GEN-LAST:event_bot4MouseExited

    private void bot5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot5MouseEntered
        bot5.setForeground(Color.red);
    }//GEN-LAST:event_bot5MouseEntered

    private void bot5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot5MouseExited
        bot5.setForeground(Color.black);
    }//GEN-LAST:event_bot5MouseExited

    private void bot6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot6MouseEntered
        bot6.setForeground(Color.red);
    }//GEN-LAST:event_bot6MouseEntered

    private void bot6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot6MouseExited
        bot6.setForeground(Color.black);
    }//GEN-LAST:event_bot6MouseExited

    private void bot7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot7MouseEntered
        bot7.setForeground(Color.red);
    }//GEN-LAST:event_bot7MouseEntered

    private void bot7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot7MouseExited
        bot7.setForeground(Color.black);
    }//GEN-LAST:event_bot7MouseExited

    private void bot8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot8MouseEntered
        bot8.setForeground(Color.red);
    }//GEN-LAST:event_bot8MouseEntered

    private void bot8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot8MouseExited
        bot8.setForeground(Color.black);
    }//GEN-LAST:event_bot8MouseExited

    private void bot9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot9MouseEntered
        bot9.setForeground(Color.red);
    }//GEN-LAST:event_bot9MouseEntered

    private void bot9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bot9MouseExited
        bot9.setForeground(Color.black);
    }//GEN-LAST:event_bot9MouseExited

    private void botmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botmasMouseClicked
        botmas.setForeground(Color.blue);
        botmas.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_botmasMouseClicked

    private void botmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botmenosActionPerformed
        numero1 = Integer.parseInt(resultado.getText());
        resultado.setText("-");
    }//GEN-LAST:event_botmenosActionPerformed

    private void botmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botmultiplicacionActionPerformed
        numero1 = Integer.parseInt(resultado.getText());
        resultado.setText("*");
    }//GEN-LAST:event_botmultiplicacionActionPerformed

    private void botdivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botdivisionActionPerformed
        numero1 = Integer.parseInt(resultado.getText());
        resultado.setText("/");
    }//GEN-LAST:event_botdivisionActionPerformed

    private void botmenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botmenosMouseClicked
        botmenos.setForeground(Color.blue);
        botmenos.setFont(new java.awt.Font("Tahoma", 1, 14));
        op = resultado.getText();
    }//GEN-LAST:event_botmenosMouseClicked

    private void botmultiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botmultiplicacionMouseClicked
        botmultiplicacion.setForeground(Color.blue);
        botmultiplicacion.setFont(new java.awt.Font("Tahoma", 1, 14));
        op = resultado.getText();
    }//GEN-LAST:event_botmultiplicacionMouseClicked

    private void botdivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botdivisionMouseClicked
        botdivision.setForeground(Color.blue);
        botdivision.setFont(new java.awt.Font("Tahoma", 1, 14));
        op = resultado.getText();
    }//GEN-LAST:event_botdivisionMouseClicked
          
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot0;
    private javax.swing.JButton bot1;
    private javax.swing.JButton bot2;
    private javax.swing.JButton bot3;
    private javax.swing.JButton bot4;
    private javax.swing.JButton bot5;
    private javax.swing.JButton bot6;
    private javax.swing.JButton bot7;
    private javax.swing.JButton bot8;
    private javax.swing.JButton bot9;
    private javax.swing.JButton botdivision;
    private javax.swing.JButton botigual;
    private javax.swing.JButton botmas;
    private javax.swing.JButton botmenos;
    private javax.swing.JButton botmultiplicacion;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
