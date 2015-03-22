/*    */ package main;
/*    */ 
/*    */ import COntroleur.MP_modifier_controleur;
/*    */ import Modele.MP_modifier_modele;
/*    */ import Vue.MP_modifier_vue;
/*    */ import bd.BDD;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class MP_modifier_main
/*    */ {
/* 10 */   BDD bd = null;
/*    */ 
/*    */   public MP_modifier_main(BDD bdd) {
/* 13 */     this.bd = bdd;
/* 14 */     MP_modifier_modele modele = new MP_modifier_modele(this.bd);
/* 15 */     MP_modifier_vue vue = new MP_modifier_vue(modele);
/* 16 */     MP_modifier_controleur controleur = new MP_modifier_controleur(modele, vue, this.bd);
/* 17 */     vue.retour.addActionListener(controleur);
/* 18 */     vue.rechercher.addActionListener(controleur);
/* 19 */     vue.sauver.addActionListener(controleur);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.MP_modifier_main
 * JD-Core Version:    0.6.2
 */