package sma.gui;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Timer;
import sma.Agents.ControllerAgent;
import utils.Constants;

/**
 *
 */
public class MainWindow extends JFrame {
    
    private static MainWindow INSTANCE;
    private final ControllerAgent controllerAgent;
    
    /**
     * Creates new form MainWindow
     */
    private MainWindow(ControllerAgent controllerAgent) {        
        initComponents();
        this.controllerAgent = controllerAgent;
        
        Timer timer = new Timer((int)(1f/Constants.FRAMERATE*1000), (ActionEvent evt) -> {
            roadPanel1.revalidate();
            roadPanel1.repaint();
        });

        timer.start();
    }
    
    /**
     *
     * @return
     */
    public static MainWindow instance() {
        return instance(null);
    }

    /**
     *
     * @param controllerAgent
     * @return
     */
    public static MainWindow instance(ControllerAgent controllerAgent) {
        if (INSTANCE == null) {
            INSTANCE = new MainWindow(controllerAgent);
            java.awt.EventQueue.invokeLater(() -> {
                INSTANCE.setVisible(true);
            });
        }
        return INSTANCE;
    }

    /**
     *
     * @return
     */
    public ControllerAgent getControllerAgent() {
        return controllerAgent;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roadPanel1 = new sma.gui.RoadPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setName("MASCar"); // NOI18N
        setResizable(false);

        roadPanel1.setName(""); // NOI18N

        javax.swing.GroupLayout roadPanel1Layout = new javax.swing.GroupLayout(roadPanel1);
        roadPanel1.setLayout(roadPanel1Layout);
        roadPanel1Layout.setHorizontalGroup(
            roadPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        roadPanel1Layout.setVerticalGroup(
            roadPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(roadPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(roadPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sma.gui.RoadPanel roadPanel1;
    // End of variables declaration//GEN-END:variables
}
