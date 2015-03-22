/*    */ package main;
/*    */ 
/*    */ import COntroleur.UO_supprimer_controleur;
/*    */ import Modele.UO_supprimer_modele;
/*    */ import Vue.UO_supprimer_vue;
/*    */ import bd.BDD;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class UO_supprimer_main
/*    */ {
/* 10 */   BDD bd = null;
/*    */ 
/*    */   public UO_supprimer_main(BDD bdd) {
/* 13 */     this.bd = bdd;
/* 14 */     UO_supprimer_modele modele = new UO_supprimer_modele(this.bd);
/* 15 */     UO_supprimer_vue vue = new UO_supprimer_vue(modele);
/* 16 */     UO_supprimer_controleur controleur = new UO_supprimer_controleur(modele, vue, this.bd);
/* 17 */     vue.retour.addActionListener(controleur);
/* 18 */     vue.rechercher.addActionListener(controleur);
/* 19 */     vue.suppr.addActionListener(controleur);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.UO_supprimer_main
 * JD-Core Version:    0.6.2
 */