/*    */ package main;
/*    */ 
/*    */ import COntroleur.Menu_controleur;
/*    */ import Modele.Menu_Modele;
/*    */ import Vue.Menu_vue_administrateur;
/*    */ import Vue.Menu_vue_commercial;
/*    */ import Vue.Menu_vue_directeur;
/*    */ import Vue.Menu_vue_production;
/*    */ import bd.BDD;
/*    */ import java.io.PrintStream;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class Menu_main
/*    */ {
/* 13 */   BDD bd = null;
/*    */ 
/* 15 */   public Menu_main(BDD bdd) { this.bd = bdd;
/* 16 */     IMenu_vue vue = null;
/* 17 */     Menu_controleur controleur = null;
/* 18 */     Menu_Modele modele = new Menu_Modele(this.bd);
/* 19 */     if (this.bd.indice.intValue() != 0) {
/* 20 */       System.out.println(this.bd.indice);
/* 21 */       if (this.bd.indice.intValue() == 1)
/*    */       {
/* 23 */         vue = new Menu_vue_production(modele);
/* 24 */         System.out.println(this.bd.indice);
/* 25 */         controleur = new Menu_controleur(modele, vue, this.bd);
/* 26 */       } else if (this.bd.indice.intValue() == 2)
/*    */       {
/* 28 */         vue = new Menu_vue_directeur(modele);
/* 29 */         controleur = new Menu_controleur(modele, vue, this.bd);
/* 30 */       } else if (this.bd.indice.intValue() == 3)
/*    */       {
/* 32 */         vue = new Menu_vue_commercial(modele);
/* 33 */         controleur = new Menu_controleur(modele, vue, this.bd);
/*    */       }
/*    */     } else {
/* 36 */       vue = new Menu_vue_administrateur(modele);
/* 37 */       controleur = new Menu_controleur(modele, vue, this.bd);
/*    */     }
/*    */ 
/* 41 */     IMenu_vue.consulter.addActionListener(controleur);
/* 42 */     IMenu_vue.UO.addActionListener(controleur);
/* 43 */     IMenu_vue.MP.addActionListener(controleur);
/* 44 */     IMenu_vue.creer_fiche.addActionListener(controleur);
/* 45 */     IMenu_vue.modifier_fiche.addActionListener(controleur);
/* 46 */     IMenu_vue.taux_essuyage.addActionListener(controleur);
/* 47 */     IMenu_vue.coeff_mavet.addActionListener(controleur);
/* 48 */     IMenu_vue.retour.addActionListener(controleur);
/* 49 */     IMenu_vue.sauvegarder.addActionListener(controleur);
/* 50 */     IMenu_vue.charger.addActionListener(controleur);
/* 51 */     IMenu_vue.ajout_utilisateur.addActionListener(controleur);
/* 52 */     IMenu_vue.liste.addActionListener(controleur);
/* 53 */     IMenu_vue.centre_appro.addActionListener(controleur);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.Menu_main
 * JD-Core Version:    0.6.2
 */