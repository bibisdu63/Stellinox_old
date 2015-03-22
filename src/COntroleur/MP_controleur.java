/*    */ package COntroleur;
/*    */ 
/*    */ import Vue.MP_vue;
/*    */ import bd.BDD;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JOptionPane;
/*    */ import main.MP_ajouter_main;
/*    */ import main.MP_modifier_main;
/*    */ import main.MP_supprimer_main;
/*    */ import net.sf.jasperreports.engine.JRException;
/*    */ import net.sf.jasperreports.engine.JasperCompileManager;
/*    */ import net.sf.jasperreports.engine.JasperFillManager;
/*    */ import net.sf.jasperreports.engine.JasperPrint;
/*    */ import net.sf.jasperreports.engine.JasperReport;
/*    */ import net.sf.jasperreports.engine.design.JasperDesign;
/*    */ import net.sf.jasperreports.engine.xml.JRXmlLoader;
/*    */ import net.sf.jasperreports.view.JasperViewer;
/*    */ 
/*    */ public class MP_controleur
/*    */   implements ActionListener
/*    */ {
/* 24 */   BDD bdd = null;
/* 25 */   MP_vue vue = null;
/*    */ 
/*    */   public MP_controleur(MP_vue vue, BDD bdd) {
/* 28 */     this.vue = vue;
/* 29 */     this.bdd = bdd;
/*    */   }
/*    */ 
/*    */   public void actionPerformed(ActionEvent e) {
/* 33 */     if (e.getSource() == this.vue.retour) {
/* 34 */       this.vue.dispose();
/*    */     }
/* 36 */     if (e.getSource() == this.vue.imprimer) {
/*    */       try
/*    */       {
/* 39 */         JasperDesign jasperDesign = JRXmlLoader.load("C:\\prix_revient\\formulaire\\matiere_premiere.jrxml");
/* 40 */         JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
/*    */ 
/* 43 */         JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, this.bdd.getConn());
/*    */ 
/* 45 */         JasperViewer.viewReport(jasperPrint, false);
/*    */       } catch (JRException ex) {
/* 47 */         JOptionPane.showMessageDialog(null, ex.getMessage(), "erreur", 0);
/*    */       }
/*    */     }
/* 50 */     if (e.getSource() == this.vue.modifier) {
/* 51 */       this.vue.dispose();
/*    */ 
/* 53 */       new MP_modifier_main(this.bdd);
/*    */     }
/*    */ 
/* 56 */     if (e.getSource() == this.vue.supprimer) {
/* 57 */       this.vue.dispose();
/*    */ 
/* 59 */       new MP_supprimer_main(this.bdd);
/*    */     }
/* 61 */     if (e.getSource() == this.vue.ajouter) {
/* 62 */       this.vue.dispose();
/*    */ 
/* 64 */       new MP_ajouter_main(this.bdd);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     COntroleur.MP_controleur
 * JD-Core Version:    0.6.2
 */