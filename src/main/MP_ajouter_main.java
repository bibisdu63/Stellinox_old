/*    */ package main;
/*    */ 
/*    */ import COntroleur.MP_ajouter_controleur;
/*    */ import Modele.MP_ajouter_modele;
/*    */ import Vue.MP_ajouter_vue;
/*    */ import bd.BDD;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class MP_ajouter_main
/*    */ {
/* 10 */   BDD bd = null;
/*    */ 
/*    */   public MP_ajouter_main(BDD bdd) {
/* 13 */     this.bd = bdd;
/* 14 */     MP_ajouter_modele modele = new MP_ajouter_modele(this.bd);
/* 15 */     MP_ajouter_vue vue = new MP_ajouter_vue(modele);
/* 16 */     MP_ajouter_controleur controleur = new MP_ajouter_controleur(modele, vue, this.bd);
/* 17 */     vue.retour.addActionListener(controleur);
/* 18 */     vue.ajout.addActionListener(controleur);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.MP_ajouter_main
 * JD-Core Version:    0.6.2
 */