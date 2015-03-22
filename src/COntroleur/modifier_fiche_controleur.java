/*    */ package COntroleur;
/*    */ 
/*    */ import Modele.modifier_fiche_modele;
/*    */ import Vue.modifier_fiche_vue;
/*    */ import bd.BDD;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class modifier_fiche_controleur
/*    */   implements ActionListener
/*    */ {
/* 14 */   modifier_fiche_modele modele = null;
/* 15 */   modifier_fiche_vue vue = null;
/* 16 */   BDD bdd = null;
/*    */ 
/*    */   public modifier_fiche_controleur(modifier_fiche_modele modele, modifier_fiche_vue vue, BDD bd) {
/* 19 */     this.modele = modele;
/* 20 */     this.vue = vue;
/* 21 */     this.bdd = bd;
/*    */   }
/*    */ 
/*    */   public void actionPerformed(ActionEvent e)
/*    */   {
/* 26 */     if (e.getSource() == this.vue.retour) {
/* 27 */       this.vue.dispose();
/* 28 */       this.modele = null;
/* 29 */       this.vue = null;
/* 30 */       this.bdd = null;
/* 31 */     } else if (e.getSource() == this.vue.retour_uo) {
/* 32 */       this.vue.dispose();
/* 33 */       this.modele = null;
/* 34 */       this.vue = null;
/* 35 */       this.bdd = null;
/* 36 */     } else if (e.getSource() == this.vue.retour_g) {
/* 37 */       this.vue.dispose();
/* 38 */       this.modele = null;
/* 39 */       this.vue = null;
/* 40 */       this.bdd = null;
/* 41 */     } else if (e.getSource() == this.vue.sauver) {
/* 42 */       String des = this.vue.getDes();
/* 43 */       String code = this.vue.getCode();
/* 44 */       int ret = this.modele.maj_entete(code, des);
/* 45 */       if (ret == 1)
/* 46 */         JOptionPane.showMessageDialog(this.vue, "mise à jour effectué avec succés", "MAJ", 1);
/* 47 */       else if (ret == 0)
/* 48 */         JOptionPane.showMessageDialog(this.vue, "erreur lors de la mise à jour", "MAJ", 0);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     COntroleur.modifier_fiche_controleur
 * JD-Core Version:    0.6.2
 */