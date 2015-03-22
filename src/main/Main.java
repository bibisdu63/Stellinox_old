/*    */ package main;
/*    */ 
/*    */ import COntroleur.Connexion_controleur;
/*    */ import Modele.Connexion_modele;
/*    */ import Vue.Connexion_vue;
/*    */ import bd.BDD;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class Main
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 24 */     BDD bdd = new BDD();
/* 25 */     Connexion_modele modele = new Connexion_modele(bdd);
/* 26 */     Connexion_vue vue = new Connexion_vue(modele);
/* 27 */     Connexion_controleur controleur = new Connexion_controleur(modele, vue, bdd);
/* 28 */     vue.setVisible(true);
/*    */ 
/* 30 */     vue.retour.addActionListener(controleur);
/* 31 */     vue.valider.addActionListener(controleur);
/* 32 */     vue.addKeyListener(controleur);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.Main
 * JD-Core Version:    0.6.2
 */