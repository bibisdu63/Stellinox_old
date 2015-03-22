/*    */ package COntroleur;
/*    */ 
/*    */ import Modele.creer_fiche_modele;
/*    */ import Vue.creer_fiche_vue;
/*    */ import bd.BDD;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JOptionPane;
/*    */ import javax.swing.JTextField;
/*    */ 
/*    */ public class creer_fiche_controleur
/*    */   implements ActionListener
/*    */ {
/* 14 */   creer_fiche_modele modele = null;
/* 15 */   creer_fiche_vue vue = null;
/* 16 */   BDD bdd = null;
/*    */ 
/* 18 */   public creer_fiche_controleur(creer_fiche_modele modele, creer_fiche_vue vue, BDD bdd) { this.modele = modele;
/* 19 */     this.vue = vue;
/* 20 */     this.bdd = bdd; }
/*    */ 
/*    */   public void actionPerformed(ActionEvent e)
/*    */   {
/* 24 */     if (e.getSource() == this.vue.retour) {
/* 25 */       this.vue.dispose();
/*    */     }
/* 27 */     if (e.getSource() == this.vue.sauver) {
/* 28 */       int ret = this.modele.creer_fiche(this.vue.getCode().getText(), this.vue.getdes().getText());
/* 29 */       if (ret == 1)
/* 30 */         JOptionPane.showMessageDialog(this.vue, "fiche créée avec succés", "création", 1);
/*    */       else
/* 32 */         JOptionPane.showMessageDialog(this.vue, "Erreur création fiche", "création", 0);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     COntroleur.creer_fiche_controleur
 * JD-Core Version:    0.6.2
 */