/*    */ package main;
/*    */ 
/*    */ import COntroleur.MP_controleur;
/*    */ import Vue.MP_vue;
/*    */ import bd.BDD;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class MP_main
/*    */ {
/*    */   public MP_main(BDD bdd)
/*    */   {
/* 10 */     MP_vue vue = new MP_vue();
/* 11 */     MP_controleur controleur = new MP_controleur(vue, bdd);
/* 12 */     vue.retour.addActionListener(controleur);
/* 13 */     vue.modifier.addActionListener(controleur);
/* 14 */     vue.supprimer.addActionListener(controleur);
/* 15 */     vue.ajouter.addActionListener(controleur);
/* 16 */     vue.imprimer.addActionListener(controleur);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.MP_main
 * JD-Core Version:    0.6.2
 */