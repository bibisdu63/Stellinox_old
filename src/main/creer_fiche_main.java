/*    */ package main;
/*    */ 
/*    */ import COntroleur.creer_fiche_controleur;
/*    */ import Modele.creer_fiche_modele;
/*    */ import Vue.creer_fiche_vue;
/*    */ import bd.BDD;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class creer_fiche_main
/*    */ {
/* 10 */   BDD bd = null;
/*    */ 
/*    */   public creer_fiche_main(BDD bdd) {
/* 13 */     this.bd = bdd;
/* 14 */     creer_fiche_modele modele = new creer_fiche_modele(this.bd);
/* 15 */     creer_fiche_vue vue = new creer_fiche_vue(modele);
/* 16 */     creer_fiche_controleur controleur = new creer_fiche_controleur(modele, vue, this.bd);
/* 17 */     vue.retour.addActionListener(controleur);
/* 18 */     vue.sauver.addActionListener(controleur);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.creer_fiche_main
 * JD-Core Version:    0.6.2
 */