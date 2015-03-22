/*    */ package COntroleur;
/*    */ 
/*    */ import Modele.MP_ajouter_modele;
/*    */ import Vue.MP_ajouter_vue;
/*    */ import bd.BDD;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class MP_ajouter_controleur
/*    */   implements ActionListener
/*    */ {
/* 14 */   MP_ajouter_modele modele = null;
/* 15 */   MP_ajouter_vue vue = null;
/* 16 */   BDD bdd = null;
/*    */ 
/* 18 */   public MP_ajouter_controleur(MP_ajouter_modele modele, MP_ajouter_vue vue, BDD bdd) { this.modele = modele;
/* 19 */     this.vue = vue;
/* 20 */     this.bdd = bdd;
/*    */   }
/*    */ 
/*    */   public void actionPerformed(ActionEvent event)
/*    */   {
/* 25 */     if (event.getSource() == this.vue.retour) {
/* 26 */       this.vue.dispose();
/* 27 */       this.modele = null;
/* 28 */       this.vue = null;
/* 29 */       this.bdd = null;
/*    */     }
/* 31 */     else if (event.getSource() == this.vue.ajout) {
/* 32 */       int retour = JOptionPane.showConfirmDialog(this.vue, "Voulez-vous confirmer l'ajout ?", "Confirmation ajout", 0, 3);
/*    */ 
/* 34 */       if (retour == 0)
/*    */       {
/* 36 */         int ret = this.modele.ajouter_mp(this.vue.getCode(), this.vue.getDes(), this.vue.getUnit(), this.vue.getPu());
/* 37 */         if (ret == 1)
/* 38 */           JOptionPane.showMessageDialog(this.vue, "Ajout executé avec succés", "ajout", 1);
/*    */         else
/* 40 */           JOptionPane.showMessageDialog(this.vue, "Erreur lors de l'ajout - cette matière première existe déjà?", "Suppression", 0);
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     COntroleur.MP_ajouter_controleur
 * JD-Core Version:    0.6.2
 */