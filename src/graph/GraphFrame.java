/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class GraphFrame extends javax.swing.JFrame {

    /**
     * Creates new form GraphFrame
     */
    public GraphFrame() {
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

        jPanel1 = new PaintPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jPanel1AncestorResized(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        jPanel1.setFocusable(true);
        jPanel1.requestFocusInWindow();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
        System.out.println(evt.getKeyCode());
        if(evt.getKeyCode() == 38){
            YCENTER -= 50;
            repaint();
        }
        if(evt.getKeyCode() == 40){
            YCENTER += 50;
            repaint();
        }
        if(evt.getKeyCode() == 37){
            XCENTER -= 50;
            repaint();
        }
        if(evt.getKeyCode() == 39){
            XCENTER += 50;
            repaint();
        }
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel1AncestorResized
        // TODO add your handling code here:
        XCENTER = jPanel1.getWidth() / 2;
        YCENTER = jPanel1.getHeight() / 2;
        repaint();
    }//GEN-LAST:event_jPanel1AncestorResized

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
            java.util.logging.Logger.getLogger(GraphFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphFrame().setVisible(true);
            }
        });
    }
    
    public class PaintPane extends JPanel{
        @Override
        public void paint(Graphics g){
            update(g);
        }
        
        @Override
        public void update(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            BufferedImage bufferedImage;
                int widthJPanel = jPanel1.getWidth();
                int HeightJPanel = jPanel1.getHeight();
            bufferedImage = (BufferedImage)createImage(widthJPanel, HeightJPanel);
            
            g2d.drawImage(drawGraphic(XCENTER, YCENTER, bufferedImage), 0, 0, this);
        }
    }
    
    //MyVariables
    int step = 50;
    int XCENTER;
    int YCENTER;
    int DATA[] = {54,17,32,43,36,39,47,50,63,60,49,53,58,62,58,58,54,53,60,56,53,61,63,52,63,65,56,60,50,70,52,60,58,55,71,58,62,62,49,70,54,51,
                    54,17,32,43,36,39,47,50,63,60,49,53,58,62,58,58,54,53,60,56,53,61,63,52,63,65,56,60,50,70,52,60,58,55,71,58,62,62,49,70,54,51};
    //My functions
    public BufferedImage drawGraphic(int xcenter, int ycenter, BufferedImage BI){
        
        Graphics graphics = BI.getGraphics();
        graphics.setColor(Color.black);
        graphics.drawRect(0, 0, BI.getWidth()-1, BI.getHeight()-1);
            //int xcenter = jPanel1.getWidth() / 2;
            //int ycenter = jPanel1.getHeight() / 2;
        graphics.drawOval(xcenter - 2, ycenter - 2, 5, 5);
            
            for(int i = 1; i < DATA.length - 1; i++){
                
                //graphics.drawLine(xcenter+i-1, ycenter-DATA[i-1], xcenter+i, ycenter-DATA[i]);
                graphics.drawLine(xcenter+i-1, ycenter-DATA[i-1], xcenter+i, ycenter-DATA[i]);
                
            }
        return BI;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
