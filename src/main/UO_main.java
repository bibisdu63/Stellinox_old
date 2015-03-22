/*    */ package main;
/*    */ 
/*    */ import COntroleur.UO_controleur;
/*    */ import Vue.UO_vue;
/*    */ import bd.BDD;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class UO_main
/*    */ {
/*    */   public UO_main(BDD bdd)
/*    */   {
/* 10 */     String nom = bdd.getName();
/* 11 */     UO_vue vue = new UO_vue(nom);
/* 12 */     UO_controleur controleur = new UO_controleur(vue, bdd);
/* 13 */     vue.retour.addActionListener(controleur);
/* 14 */     vue.ajouter.addActionListener(controleur);
/* 15 */     vue.modifier.addActionListener(controleur);
/* 16 */     vue.supprimer.addActionListener(controleur);
/* 17 */     vue.imprimer.addActionListener(controleur);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.UO_main
 * JD-Core Version:    0.6.2
 */