/*    */ package main;
/*    */ 
/*    */ import COntroleur.MP_supprimer_controleur;
/*    */ import Modele.MP_supprimer_modele;
/*    */ import Vue.MP_supprimer_vue;
/*    */ import bd.BDD;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class MP_supprimer_main
/*    */ {
/* 10 */   BDD bd = null;
/*    */ 
/*    */   public MP_supprimer_main(BDD bdd) {
/* 13 */     this.bd = bdd;
/* 14 */     MP_supprimer_modele modele = new MP_supprimer_modele(this.bd);
/* 15 */     MP_supprimer_vue vue = new MP_supprimer_vue(modele);
/* 16 */     MP_supprimer_controleur controleur = new MP_supprimer_controleur(modele, vue, this.bd);
/* 17 */     vue.retour.addActionListener(controleur);
/* 18 */     vue.rechercher.addActionListener(controleur);
/* 19 */     vue.suppr.addActionListener(controleur);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.MP_supprimer_main
 * JD-Core Version:    0.6.2
 */