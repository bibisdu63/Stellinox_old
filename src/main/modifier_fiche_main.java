/*    */ package main;
/*    */ 
/*    */ import COntroleur.modifier_fiche_controleur;
/*    */ import Modele.modifier_fiche_modele;
/*    */ import Vue.modifier_fiche_vue;
/*    */ import bd.BDD;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class modifier_fiche_main
/*    */ {
/* 10 */   BDD bd = null;
/*    */ 
/*    */   public modifier_fiche_main(BDD bdd) {
/* 13 */     this.bd = bdd;
/* 14 */     modifier_fiche_modele modele = new modifier_fiche_modele(this.bd);
/* 15 */     modifier_fiche_vue vue = new modifier_fiche_vue(modele);
/* 16 */     modifier_fiche_controleur controleur = new modifier_fiche_controleur(modele, vue, this.bd);
/* 17 */     vue.retour.addActionListener(controleur);
/* 18 */     vue.retour_uo.addActionListener(controleur);
/* 19 */     vue.retour_g.addActionListener(controleur);
/* 20 */     vue.sauver.addActionListener(controleur);
/* 21 */     modele.addObserver(vue);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.modifier_fiche_main
 * JD-Core Version:    0.6.2
 */