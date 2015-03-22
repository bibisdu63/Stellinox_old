/*    */ package Modele;
/*    */ 
/*    */ import bd.BDD;
/*    */ import java.util.Observable;
/*    */ 
/*    */ public class Connexion_modele extends Observable
/*    */ {
/*    */   BDD bdd;
/*    */ 
/*    */   public Connexion_modele(BDD bd)
/*    */   {
/* 14 */     this.bdd = bd;
/*    */   }
/*    */   public int connexion_bdd(String adresse, String port, String pseudo, String mdp) {
/* 17 */     int test = this.bdd.connexion(adresse, port, pseudo, mdp);
/* 18 */     return test;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Modele.Connexion_modele
 * JD-Core Version:    0.6.2
 */