/*    */ package COntroleur;
/*    */ 
/*    */ import Vue.UO_vue;
/*    */ import bd.BDD;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import java.io.PrintStream;
/*    */ import javax.swing.JOptionPane;
/*    */ import main.UO_ajouter_main;
/*    */ import main.UO_modifier_main;
/*    */ import main.UO_supprimer_main;
/*    */ import net.sf.jasperreports.engine.JRException;
/*    */ import net.sf.jasperreports.engine.JasperCompileManager;
/*    */ import net.sf.jasperreports.engine.JasperFillManager;
/*    */ import net.sf.jasperreports.engine.JasperPrint;
/*    */ import net.sf.jasperreports.engine.JasperReport;
/*    */ import net.sf.jasperreports.engine.design.JasperDesign;
/*    */ import net.sf.jasperreports.engine.xml.JRXmlLoader;
/*    */ import net.sf.jasperreports.view.JasperViewer;
/*    */ 
/*    */ public class UO_controleur
/*    */   implements ActionListener
/*    */ {
/* 25 */   BDD bdd = null;
/* 26 */   UO_vue vue = null;
/*    */ 
/*    */   public UO_controleur(UO_vue vue, BDD bdd) {
/* 29 */     this.vue = vue;
/* 30 */     this.bdd = bdd;
/*    */   }
/*    */ 
/*    */   public void actionPerformed(ActionEvent e)
/*    */   {
/* 35 */     if (e.getSource() == this.vue.retour)
/*    */     {
/* 38 */       this.vue.dispose();
/*    */     }
/* 40 */     else if (e.getSource() == this.vue.imprimer) {
/*    */       try {
/* 42 */         System.out.println("test1");
/*    */ 
/* 44 */         JasperDesign jasperDesign = JRXmlLoader.load("C:\\prix_revient\\formulaire\\gamme_operatoire.jrxml");
/* 45 */         JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
/*    */ 
/* 48 */         JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, this.bdd.getConn());
/*    */ 
/* 50 */         JasperViewer.viewReport(jasperPrint, false);
/*    */       } catch (JRException ex) {
/* 52 */         JOptionPane.showMessageDialog(null, ex.getMessage(), "erreur", 0);
/*    */       }
/*    */     }
/* 55 */     else if (e.getSource() == this.vue.ajouter) {
/* 56 */       this.vue.dispose();
/*    */ 
/* 58 */       new UO_ajouter_main(this.bdd);
/*    */     }
/* 60 */     else if (e.getSource() == this.vue.modifier) {
/* 61 */       this.vue.dispose();
/*    */ 
/* 63 */       new UO_modifier_main(this.bdd);
/*    */     }
/* 65 */     else if (e.getSource() == this.vue.supprimer) {
/* 66 */       this.vue.dispose();
/*    */ 
/* 68 */       new UO_supprimer_main(this.bdd);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     COntroleur.UO_controleur
 * JD-Core Version:    0.6.2
 */