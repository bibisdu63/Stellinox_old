/*    */ package main;
/*    */ 
/*    */ import COntroleur.UO_modifier_controleur;
/*    */ import Modele.UO_modifier_modele;
/*    */ import Vue.UO_modifier_vue;
/*    */ import bd.BDD;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class UO_modifier_main
/*    */ {
/* 10 */   BDD bd = null;
/*    */ 
/*    */   public UO_modifier_main(BDD bdd) {
/* 13 */     this.bd = bdd;
/* 14 */     UO_modifier_modele modele = new UO_modifier_modele(this.bd);
/* 15 */     UO_modifier_vue vue = new UO_modifier_vue(modele);
/* 16 */     UO_modifier_controleur controleur = new UO_modifier_controleur(modele, vue, this.bd);
/* 17 */     vue.retour.addActionListener(controleur);
/* 18 */     vue.rechercher.addActionListener(controleur);
/* 19 */     vue.sauver.addActionListener(controleur);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.UO_modifier_main
 * JD-Core Version:    0.6.2
 */