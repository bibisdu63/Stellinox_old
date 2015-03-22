/*    */ package main;
/*    */ 
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public abstract interface IMenu_vue
/*    */ {
/*  7 */   public static final JButton MP = new JButton("Matières Premières");
/*  8 */   public static final JButton UO = new JButton("Unités d'oeuvres");
/*  9 */   public static final JButton creer_fiche = new JButton("Créer fiche");
/* 10 */   public static final JButton modifier_fiche = new JButton("Modifier fiche");
/* 11 */   public static final JButton consulter = new JButton("Consulter");
/* 12 */   public static final JButton retour = new JButton("Quitter");
/* 13 */   public static final JButton taux_essuyage = new JButton("taux d'essuyage");
/* 14 */   public static final JButton centre_appro = new JButton("centre approvisionnement");
/* 15 */   public static final JButton coeff_mavet = new JButton("Coefficient Comptable");
/* 16 */   public static final JButton sauvegarder = new JButton("Sauvegarder");
/* 17 */   public static final JButton charger = new JButton("Charger");
/* 18 */   public static final JButton ajout_utilisateur = new JButton("Ajout Utilisateur");
/* 19 */   public static final JButton liste = new JButton("Consulter liste");
/*    */ 
/*    */   public abstract void arret();
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     main.IMenu_vue
 * JD-Core Version:    0.6.2
 */