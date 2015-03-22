/*    */ package main;
/*    */ 
/*    */ import COntroleur.UO_ajouter_controleur;
/*    */ import Modele.UO_ajouter_modele;
/*    */ import Vue.UO_ajouter_vue;
/*    */ import bd.BDD;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class UO_ajouter_main
/*    */ {
/* 10 */   BDD bd = null;
/*    */ 
/*    */   public UO_ajouter_main(BDD bdd) {
/* 13 */     this.bd = bdd;
/* 14 */     UO_ajouter_modele modele = new UO_ajouter_modele(this.bd);
/* 15 */     UO_ajouter_vue vue = new UO_ajouter_vue(modele);
/* 16 */     UO_ajouter_controleur controleur = new UO_ajouter_controleur(modele, vue, this.bd);
/* 17 */     vue.retour.addActionListener(controleur);
/* 18 */     vue.ajout.addActionListener(controleur);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.UO_ajouter_main
 * JD-Core Version:    0.6.2
 */